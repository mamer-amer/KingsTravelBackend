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


    public TravelFairsCategory() {
    }

    public TravelFairsCategory(String createdAt, String updatedAt, String timeZone) {
        super(createdAt, updatedAt, timeZone);
    }

    public TravelFairsCategory(Long id, String category) {
        this.id = id;
        this.category = category;
    }

    public TravelFairsCategory(String createdAt, String updatedAt, String timeZone, Long id, String category) {
        super(createdAt, updatedAt, timeZone);
        this.id = id;
        this.category = category;
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
}
