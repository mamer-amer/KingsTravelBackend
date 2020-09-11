package com.example.kingsTravel.CONTROLLERS;


import com.example.kingsTravel.DTO.TravelFairDto;
import com.example.kingsTravel.MODEL.TravelFairs;
import com.example.kingsTravel.REPOSITORY.TravelFairRepository;
import com.example.kingsTravel.SERVICES.TravelFariService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class TravelFairsController {

    @Autowired
    TravelFairRepository travelFairRepository;

    @Autowired
    TravelFariService travelFariService;

    @PostMapping("/fair")
    private ResponseEntity<TravelFairs> save(@RequestBody TravelFairDto travelFairDto){
        return travelFariService.save(travelFairDto);
    }



}
