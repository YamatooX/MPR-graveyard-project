package com.example.demo.models;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

//Entity
//@Table name

// Najpierw czytaj, potem implementuj!!!
@Entity
@Table(name = "Grave")
public class Grave {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer maxCapacity;
    private Integer actualCapacity;
    @OneToMany
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List<Corpse> corpses;

    public Grave(Integer id, Integer maxCapacity, Integer actualCapacity, List<Corpse> corpses) {
        this.id = id;
        this.maxCapacity = maxCapacity;
        this.actualCapacity = actualCapacity;
        this.corpses = corpses;
    }

    public Grave(Integer id){
        this.id = id;
    }

    public Integer getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public Integer getActualCapacity() {
        return actualCapacity;
    }

    public void setActualCapacity(Integer actualCapacity) {
        this.actualCapacity = actualCapacity;
    }

    public void setCorpses(List<Corpse> corpses) {
        this.corpses = corpses;
    }

    public Grave() {
    } // default constructor

    public Integer getId() {
        return id;
    } //get

    public void setId(Integer id) {
        this.id = id;
    } // set

    public List<Corpse> getCorpses() {
        return corpses;
    } // get list

    public void addCorpse(){
        if(actualCapacity + 1 <= maxCapacity )
            corpses.add(new Corpse());
        maxCapacity++;
    }

    public void removeCorpse(Corpse corpse){
        corpses.remove(corpse);
    }

    @Override
    public String toString() {
        return "Grave{" +
                "id=" + id +
                ", size=" + corpses.size() +
                ", corpses" + corpses +
                '}';
    }
}
