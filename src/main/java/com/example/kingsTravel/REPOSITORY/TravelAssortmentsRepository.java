package com.example.kingsTravel.REPOSITORY;

import com.example.kingsTravel.MODEL.TravelFairAndCategoryAssortments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelAssortmentsRepository extends JpaRepository<TravelFairAndCategoryAssortments,Long> {
}
