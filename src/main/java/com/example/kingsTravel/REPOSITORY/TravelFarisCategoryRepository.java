package com.example.kingsTravel.REPOSITORY;

import com.example.kingsTravel.MODEL.TravelFairsCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RepositoryRestResource(collectionResourceRel = "category",path = "fairCategory")
public interface TravelFarisCategoryRepository extends JpaRepository<TravelFairsCategory,Long> {
}
