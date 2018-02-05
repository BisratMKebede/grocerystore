package com.bisratmk.grocerystore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Cosmetics {

   @Id
   @GeneratedValue(strategy= GenerationType.AUTO)
   private int  id;

    @NotNull
    @Size(min = 4)
   private String  brand;

    @NotNull
    @Size(min = 1)
   private String cprice;

    @NotNull
    @Size(min = 4)
   private String  popularity;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCprice() {
        return cprice;
    }

    public void setCprice(String cprice) {
        this.cprice = cprice;
    }

    public String getPopularity() {
        return popularity;
    }

    public void setPopularity(String popularity) {
        this.popularity = popularity;
    }
}
