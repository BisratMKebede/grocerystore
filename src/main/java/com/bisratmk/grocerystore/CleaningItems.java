package com.bisratmk.grocerystore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class CleaningItems {


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int  id;

    @NotNull
    @Size(min = 4)
    private String strength;

    @NotNull
    @Size(min = 1)
    private double Ciprice;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public double getCiprice() {
        return Ciprice;
    }

    public void setCiprice(double ciprice) {
        this.Ciprice = ciprice;
    }
}
