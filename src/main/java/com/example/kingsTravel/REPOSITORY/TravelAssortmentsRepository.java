package com.example.kingsTravel.REPOSITORY;

import com.example.kingsTravel.DTO.HomePageDTO;
import com.example.kingsTravel.DTO.TravelCategoryPriceDTO;
import com.example.kingsTravel.MODEL.TravelFairAndCategoryAssortments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface TravelAssortmentsRepository extends JpaRepository<TravelFairAndCategoryAssortments,Long> {

//        @Query(value = "Select new com.example.kingsTravel.DTO.HomePageDTO" +
//                " (amount,arrival_date,arrival_to,departure_date,departure_from,discount,price,category) " +
//                "from((travel_fair_and_category_assortments tfc inner join travel_fairs tf on tfc.travel_fairs_id=tf.id)" +
//                " inner join category c on tfc.travel_fairs_category_id=c.id)",nativeQuery = true)
//         List<HomePageDTO> getAll();

        @Query(value = "select * from travel_fair_and_category_assortments where travel_fairs_id=:id",nativeQuery = true)
        List<TravelFairAndCategoryAssortments> getById(@Param("id") Long id);

    @Query("Select new com.example.kingsTravel.DTO.TravelCategoryPriceDTO(tfc.travelFairsCategory.id,price) from TravelFairAndCategoryAssortments tfc where tfc.travelFairs.id=:id")
    List<TravelCategoryPriceDTO> findByTravelFairId(@Param("id") Long id);

    @Modifying
    @Transactional
    @Query(value = "DELETE from travel_fair_and_category_assortments where travel_fairs_id=:id",nativeQuery = true)
    void  deleteAllRelations(@Param("id") Long id);
}


