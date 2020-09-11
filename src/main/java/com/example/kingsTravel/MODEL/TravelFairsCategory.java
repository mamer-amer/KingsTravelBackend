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


    @ManyToMany(mappedBy = "travelFairsCategories")
    Set<TravelFairs> travelFairsSet = new HashSet<>();


    public TravelFairsCategory() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<TravelFairs> getTravelFairsSet() {
        return travelFairsSet;
    }

    public void setTravelFairsSet(Set<TravelFairs> travelFairsSet) {
        this.travelFairsSet = travelFairsSet;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
