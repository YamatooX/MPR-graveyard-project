package com.example.demo.models;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;
//@Entity
//@TAblename

// Najpierw poczytaj, potem implementuj!!!!
@Entity
@Table(name = "Corpse")
public class Corpse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String lastName;
    private String deathDate;
    @ManyToOne
    private Grave grave;

    public Corpse(Integer id, String name, String lastName, String deathDate) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.deathDate = deathDate;
    }

    public Corpse() {
    }

    public Grave getGrave() {
        return grave;
    }

    public void setGrave(Grave grave) {
        this.grave = grave;
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

    public String getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(String deathDate) {
        this.deathDate = deathDate;
    }


}
