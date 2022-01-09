package com.example.demo.models;

import java.util.List;

//Entity
//@Table name

// Najpierw czytaj, potem implementuj!!!

public class Grave {
    //ID
    //Generated value
    private Integer id;
    private Corpse corpse;
    //@relacje! z corpsem
    //cascade type.ALL
    private List<Corpse> corpses;

    public Grave(Integer id, Corpse corpse, List<Corpse> corpses) {
        this.id = id;
        this.corpse = corpse;
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

    public Corpse getCorpse() {
        return corpse;
    } //get

    public void setCorpse(Corpse corpse) {
        this.corpse = corpse;
    } //set

    public void setCorpses(List<Corpse> corpses) {
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
                ", corpse=" + corpse +
                ", corpses=" + corpses +
                '}';
    }
}
