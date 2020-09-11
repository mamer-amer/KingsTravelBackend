package com.example.kingsTravel.SERVICES;


import com.example.kingsTravel.DTO.TravelCategoryDto;
import com.example.kingsTravel.MODEL.TravelFairs;
import com.example.kingsTravel.MODEL.TravelFairsCategory;
import com.example.kingsTravel.REPOSITORY.TravelFarisCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TravelCategoryService {
    @Autowired
    TravelFarisCategoryRepository travelFarisCategoryRepository;

    public ResponseEntity<TravelFairs> save(TravelCategoryDto categoryDto) {
        if(categoryDto.getCategory()!=null){
            TravelFairsCategory travelFairsCategory = new TravelFairsCategory();
            travelFairsCategory.setCategory(categoryDto.getCategory());
            travelFarisCategoryRepository.save(travelFairsCategory);
            return new ResponseEntity<TravelFairs>(HttpStatus.OK);
        }
        return new ResponseEntity<TravelFairs>(HttpStatus.NOT_FOUND);

    }
}
