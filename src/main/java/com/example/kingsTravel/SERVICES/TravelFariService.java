package com.example.kingsTravel.SERVICES;

import com.example.kingsTravel.CONSTANTS.ApiResponse;
import com.example.kingsTravel.CONSTANTS.Status;
import com.example.kingsTravel.DTO.HomePageDTO;
import com.example.kingsTravel.DTO.TravelCategoryPriceDTO;
import com.example.kingsTravel.DTO.TravelFairDto;
import com.example.kingsTravel.MODEL.TravelFairAndCategoryAssortments;
import com.example.kingsTravel.MODEL.TravelFairs;
import com.example.kingsTravel.MODEL.TravelFairsCategory;
import com.example.kingsTravel.REPOSITORY.TravelAssortmentsRepository;
import com.example.kingsTravel.REPOSITORY.TravelFairRepository;
import com.example.kingsTravel.REPOSITORY.TravelFarisCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.*;

@Service
public class TravelFariService {

        @Autowired
        TravelFairRepository travelFairRepository;

        @Autowired
         TravelFarisCategoryRepository categoryRepository;

        @Autowired
    TravelAssortmentsRepository travelAssortmentsRepository;


    public ResponseEntity<TravelFairs> save(TravelFairDto travelFairDto) {
        try {
            TravelFairs  travelFairs = new TravelFairs();


            //update
            if(travelFairDto.getId()!=null){
                travelFairs = travelFairRepository.findById(travelFairDto.getId()).get();
                travelAssortmentsRepository.deleteAllRelations(travelFairDto.getId());
//               travelFairDto.getTravelFairsCategories().clear();
//               travelFairDto.setTravelFairsCategories(priceDTOS);

            }

                travelFairs.setCreatedAt(new Date().toString());
                travelFairs.setUpdatedAt(new Date().toString());
                travelFairs.setTimeZone(TimeZone.getDefault().getDisplayName());
                travelFairs.setActive(travelFairDto.getActive());
                travelFairs.setAmount(travelFairDto.getAmount());
                travelFairs.setDiscount(travelFairDto.getDiscount());
                travelFairs.setArrivalDate(travelFairDto.getArrivalDate());
                travelFairs.setDepartureDate(travelFairDto.getDepartureDate());
                travelFairs.setArrivalTo(travelFairDto.getArrivalTo());
                travelFairs.setDepartureFrom(travelFairDto.getDepartureFrom());
                travelFairRepository.save(travelFairs);

            TravelFairs finalTravelFairs = travelFairs;
            travelFairDto.getTravelFairsCategories().iterator().forEachRemaining(travelFairsCategory -> {
                    TravelFairAndCategoryAssortments travelFairAndCategoryAssortments = new TravelFairAndCategoryAssortments();
                    travelFairAndCategoryAssortments.setActive(true);
                    travelFairAndCategoryAssortments.setDate(new Date());
                    travelFairAndCategoryAssortments.setTravelFairs(finalTravelFairs);
                    Optional<TravelFairsCategory> category= categoryRepository.findById(travelFairsCategory.getId());
                    travelFairAndCategoryAssortments.setTravelFairsCategory(category.get());
                    travelFairAndCategoryAssortments.setPrice(travelFairsCategory.getPrice());
                    travelAssortmentsRepository.save(travelFairAndCategoryAssortments);

                });



            return new ResponseEntity<TravelFairs>(travelFairs,HttpStatus.OK);

        }
        catch (Exception e){
            return new ResponseEntity<TravelFairs>(HttpStatus.NOT_FOUND);
        }

    }

    public ApiResponse getAllFares(){
        List<TravelFairs> travelFairsList = travelFairRepository.findAll();
        return new ApiResponse(Status.Status_Ok,"Sucess",travelFairsList);
    }

//    public ApiResponse getAllFaresAndCategories(){
//        List<HomePageDTO> homePageDTOList = travelAssortmentsRepository.getAll();
//        return new ApiResponse(Status.Status_Ok,"Succes",homePageDTOList);
//    }

    public ApiResponse getAll(){
        List<TravelFairAndCategoryAssortments> travelFairAndCategoryAssortmentsList= travelAssortmentsRepository.findAll();
        return new ApiResponse(Status.Status_Ok,"Success",travelFairAndCategoryAssortmentsList);
    }
    public ApiResponse getById(Long id){
        List<TravelFairAndCategoryAssortments> travelFairAndCategoryAssortmentsList= travelAssortmentsRepository.getById(id);
        return new ApiResponse(Status.Status_Ok,"Success",travelFairAndCategoryAssortmentsList);
    }

}
