package com.example.kingsTravel.MODEL;

import javax.persistence.*;
import java.util.Date;

@Entity
public class TravelFairAndCategoryAssortments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    TravelFairs travelFairs;

    @ManyToOne
    TravelFairsCategory travelFairsCategory;

    @Column
    Date date;

    @Column
    Boolean isActive;

    public TravelFairAndCategoryAssortments() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TravelFairs getTravelFairs() {
        return travelFairs;
    }

    public void setTravelFairs(TravelFairs travelFairs) {
        this.travelFairs = travelFairs;
    }

    public TravelFairsCategory getTravelFairsCategory() {
        return travelFairsCategory;
    }

    public void setTravelFairsCategory(TravelFairsCategory travelFairsCategory) {
        this.travelFairsCategory = travelFairsCategory;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }
}
