package com.example.kingsTravel.DTO;

import com.example.kingsTravel.MODEL.TravelFairsCategory;

public class TravelCategoryPriceDTO {

    TravelFairsCategory travelFairsCategory;
    Float price;

    public TravelCategoryPriceDTO(TravelFairsCategory travelFairsCategory, Float price) {
        this.travelFairsCategory = travelFairsCategory;
        this.price = price;
    }

    public TravelCategoryPriceDTO() {
    }

    public TravelFairsCategory getTravelFairsCategory() {
        return travelFairsCategory;
    }

    public void setTravelFairsCategory(TravelFairsCategory travelFairsCategory) {
        this.travelFairsCategory = travelFairsCategory;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
