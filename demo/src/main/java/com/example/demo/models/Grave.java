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
    private Integer capacity;
    @OneToMany
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List<Corpse> corpses;

    public Grave(Integer id, List<Corpse> corpses) {
        this.id = id;
        this.corpses = corpses;
    } // constructor with all fields

    public Grave() {
    } // default constructor

    public Integer getId() {
        return id;
    } //get

    public void setId(Integer id) {
        this.id = id;
    } // set

    public void setCorpses(List<Corpse> corpses) {
        if(this.capacity isEqual())
        this.corpses = corpses;
    } // set

    public List<Corpse> getCorpses() {
        return corpses;
    } // get list

    public void addCorpse(Corpse corpse){
        corpses.add(corpse);
    }

    public void removeCorpse(Corpse corpse){
        corpses.remove(corpse);
    }

    @Override
    public String toString() {
        return "Grave{" +
                "id=" + id +
                ", corpses=" + corpses +
                '}';
    }
}
