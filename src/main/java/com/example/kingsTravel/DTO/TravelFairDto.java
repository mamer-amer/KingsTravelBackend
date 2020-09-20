package com.example.kingsTravel.DTO;

import com.example.kingsTravel.MODEL.TravelFairsCategory;
import com.sun.istack.NotNull;

import java.io.Serializable;
import java.util.List;

public class TravelFairDto implements Serializable {

   String  departureFrom;
   String arrivalTo;
   String departureDate;
   String arrivalDate;
   Long amount;
   Long discount;
   Boolean active;

   @NotNull
   List<TravelFairsCategory> travelFairsCategories;

    public TravelFairDto() {
    }

    public String getDepartureFrom() {
        return departureFrom;
    }

    public void setDepartureFrom(String departureFrom) {
        this.departureFrom = departureFrom;
    }

    public String getArrivalTo() {
        return arrivalTo;
    }

    public void setArrivalTo(String arrivalTo) {
        this.arrivalTo = arrivalTo;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getDiscount() {
        return discount;
    }

    public void setDiscount(Long discount) {
        this.discount = discount;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public List<TravelFairsCategory> getTravelFairsCategories() {
        return travelFairsCategories;
    }

    public void setTravelFairsCategories(List<TravelFairsCategory> travelFairsCategories) {
        this.travelFairsCategories = travelFairsCategories;
    }
}
