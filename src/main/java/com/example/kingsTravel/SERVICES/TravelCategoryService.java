package com.example.kingsTravel.SERVICES;


import com.example.kingsTravel.CONSTANTS.ApiResponse;
import com.example.kingsTravel.CONSTANTS.Status;
import com.example.kingsTravel.DTO.TravelCategoryDto;
import com.example.kingsTravel.MODEL.TravelFairs;
import com.example.kingsTravel.MODEL.TravelFairsCategory;
import com.example.kingsTravel.REPOSITORY.TravelFarisCategoryRepository;
//import com.sun.xml.bind.v2.schemagen.xmlschema.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.TimeZone;

@Service
public class TravelCategoryService {
    @Autowired
    TravelFarisCategoryRepository travelFarisCategoryRepository;

    public ResponseEntity<TravelFairs> save(TravelCategoryDto categoryDto) {
        if(categoryDto.getCategory()!=null){

            TravelFairsCategory travelFairsCategory = new TravelFairsCategory();
            travelFairsCategory.setCategory(categoryDto.getCategory());
            travelFairsCategory.setCreatedAt(new Date().toString());
            travelFairsCategory.setUpdatedAt(new Date().toString());
            travelFairsCategory.setTimeZone(TimeZone.getDefault().getDisplayName());
            travelFarisCategoryRepository.save(travelFairsCategory);
            return new ResponseEntity<TravelFairs>(HttpStatus.OK);
        }
        return new ResponseEntity<TravelFairs>(HttpStatus.NOT_FOUND);

    }

    public ApiResponse getAllCategory(){
        List<TravelFairsCategory> categoryList= travelFarisCategoryRepository.findAll();
        return new ApiResponse(Status.Status_Ok,"Success",categoryList);
    }
}
