package com.example.kingsTravel.REPOSITORY;

import com.example.kingsTravel.MODEL.TravelFairs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RepositoryRestResource(collectionResourceRel = "fair", path = "fair")
public interface TravelFairRepository extends JpaRepository<TravelFairs,Long> {
}
