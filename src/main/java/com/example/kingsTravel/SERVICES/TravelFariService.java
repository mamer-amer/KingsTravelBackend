package com.example.kingsTravel.SERVICES;

import com.example.kingsTravel.DTO.TravelFairDto;
import com.example.kingsTravel.MODEL.TravelFairs;
import com.example.kingsTravel.MODEL.TravelFairsCategory;
import com.example.kingsTravel.REPOSITORY.TravelFairRepository;
import com.example.kingsTravel.REPOSITORY.TravelFarisCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TravelFariService {

        @Autowired
        TravelFairRepository travelFairRepository;

        @Autowired
         TravelFarisCategoryRepository travelFarisCategoryRepository;

    public ResponseEntity<TravelFairs> save(TravelFairDto travelFairDto) {
        try {
            TravelFairs  travelFairs = new TravelFairs();
            travelFairs.setActive(travelFairDto.getActive());
            travelFairs.setAmount(travelFairDto.getAmount());
            travelFairs.setDiscount(travelFairDto.getDiscount());
            travelFairs.setArrivalDate(travelFairDto.getArrivalDate());
            travelFairs.setDepartureDate(travelFairDto.getDepartureDate());
            travelFairs.setArrivalTo(travelFairDto.getArrivalTo());
            travelFairs.setDepartureFrom(travelFairDto.getDepartureFrom());
//            travelFairs.getTravelFairsCategories().add(travelFairDto.getTravelFairsCategories());
            travelFairRepository.save(travelFairs);
            return new ResponseEntity<TravelFairs>(travelFairs,HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<TravelFairs>(HttpStatus.NOT_FOUND);
        }

    }

}
