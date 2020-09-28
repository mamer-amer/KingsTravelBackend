package com.example.kingsTravel.DTO;

import com.example.kingsTravel.MODEL.TravelFairsCategory;

public class TravelCategoryPriceDTO {

    Long id;
    Float price;


    public TravelCategoryPriceDTO() {
    }

    public TravelCategoryPriceDTO(Long id, Float price) {
        this.id = id;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
