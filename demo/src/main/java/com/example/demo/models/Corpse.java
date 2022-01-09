package com.example.demo.models;

import java.util.Date;
//@Entity
//@TAblename

// Najpierw poczytaj, potem implementuj!!!!

public class Corpse {

    //Id
    //Generated values
    private Integer id;
    private String name;
    private String lastName;
    private Date deathDate;
    //relacja z grobem
    private Grave grave;

    public Corpse(Integer id, String name, String lastName, Date deathDate) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.deathDate = deathDate;
    }

    public Corpse() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(Date deathDate) {
        this.deathDate = deathDate;
    }


}
