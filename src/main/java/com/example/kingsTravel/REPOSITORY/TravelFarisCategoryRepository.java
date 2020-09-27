package com.example.kingsTravel.REPOSITORY;

import com.example.kingsTravel.MODEL.TravelFairsCategory;
import com.sun.xml.bind.v2.schemagen.xmlschema.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RepositoryRestResource(collectionResourceRel = "category",path = "categories")
public interface TravelFarisCategoryRepository extends JpaRepository<TravelFairsCategory,Long> {


}
