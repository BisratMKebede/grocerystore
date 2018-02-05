package com.bisratmk.grocerystore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class Snacks {



    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int  id;

    @NotNull
    @Size(min = 4)
    private String crunchiness;

    @NotNull
    @Size(min = 1)
    private String Sprice;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCrunchiness() {
        return crunchiness;
    }

    public void setCrunchiness(String crunchiness) {
        this.crunchiness = crunchiness;
    }

    public String getSprice() {
        return Sprice;
    }

    public void setSprice(String sprice) {
        this.Sprice = sprice;
    }
}
