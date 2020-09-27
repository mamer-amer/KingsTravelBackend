package com.example.kingsTravel.MODEL;

import com.example.kingsTravel.CONSTANTS.BaseEntity;
import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class TravelFairs extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column
    String departureFrom;

    @Column
    String arrivalTo;

    @Column
    String departureDate;

    @Column
    String arrivalDate;

    @Column
    Long amount;

    @Column
    Long discount;

    @Column
    Boolean isActive;


    public TravelFairs(Long id, String departureFrom, String arrivalTo, String departureDate, String arrivalDate, Long amount, Long discount, Boolean isActive) {
        this.id = id;
        this.departureFrom = departureFrom;
        this.arrivalTo = arrivalTo;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.amount = amount;
        this.discount = discount;
        this.isActive = isActive;
    }

    public TravelFairs() {
    }

    public TravelFairs(String createdAt, String updatedAt, String timeZone, Long id, String departureFrom, String arrivalTo, String departureDate, String arrivalDate, Long amount, Long discount, Boolean isActive) {
        super(createdAt, updatedAt, timeZone);
        this.id = id;
        this.departureFrom = departureFrom;
        this.arrivalTo = arrivalTo;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.amount = amount;
        this.discount = discount;
        this.isActive = isActive;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }
}
