package com.example.kingsTravel.DTO;


public class TravelCategoryDto {

    String category;
    String price;

    public TravelCategoryDto(String category, String price) {
        this.category = category;
        this.price = price;
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
