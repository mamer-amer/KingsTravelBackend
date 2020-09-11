package com.example.kingsTravel.CONTROLLERS;


import com.example.kingsTravel.DTO.TravelCategoryDto;
import com.example.kingsTravel.DTO.TravelFairDto;
import com.example.kingsTravel.MODEL.TravelFairs;
import com.example.kingsTravel.REPOSITORY.TravelFarisCategoryRepository;
import com.example.kingsTravel.SERVICES.TravelCategoryService;
import com.example.kingsTravel.SERVICES.TravelFariService;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class TravelFairCategoryController {

    @Autowired
    TravelFarisCategoryRepository travelFarisCategoryRepository;

    @Autowired
    TravelCategoryService travelCategoryService;

    @PostMapping("/fairCategory")
    private ResponseEntity<TravelFairs> save(@NotNull @RequestBody TravelCategoryDto categoryDto){
            return travelCategoryService.save(categoryDto);
    }
}
