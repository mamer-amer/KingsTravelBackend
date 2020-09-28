package com.example.kingsTravel.DTO;

public class HomePageDTO {
    String arrivalDate;
    String arrivalTo;
    String departureDate;
    String departureTo;
    double amount;
    double price;
    double discount;
    String category;

    public HomePageDTO() {
    }

    public HomePageDTO(String arrivalDate, String arrivalTo, String departureDate, String departureTo, double amount, double price, double discount, String category) {
        this.arrivalDate = arrivalDate;
        this.arrivalTo = arrivalTo;
        this.departureDate = departureDate;
        this.departureTo = departureTo;
        this.amount = amount;
        this.price = price;
        this.discount = discount;
        this.category = category;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
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

    public String getDepartureTo() {
        return departureTo;
    }

    public void setDepartureTo(String departureTo) {
        this.departureTo = departureTo;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}