package com.example.kingsTravel.DTO;


public class TravelCategoryDto {

    String category;

    public TravelCategoryDto(String category) {
        this.category = category;
    }

    public TravelCategoryDto() {
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
