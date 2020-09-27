package com.example.kingsTravel.MODEL;

import com.example.kingsTravel.CONSTANTS.BaseEntity;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "category")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class TravelFairsCategory extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @NotNull
    @Column(unique = true)
    String category;

    @NotNull
    @Column
    String categoryPrice;

    public TravelFairsCategory(Long id, String category, String categoryPrice) {
        this.id = id;
        this.category = category;
        this.categoryPrice = categoryPrice;
    }

    public TravelFairsCategory(String createdAt, String updatedAt, String timeZone, Long id, String category, String categoryPrice) {
        super(createdAt, updatedAt, timeZone);
        this.id = id;
        this.category = category;
        this.categoryPrice = categoryPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategoryPrice() {
        return categoryPrice;
    }

    public void setCategoryPrice(String categoryPrice) {
        this.categoryPrice = categoryPrice;
    }

    public TravelFairsCategory() {
    }
}
