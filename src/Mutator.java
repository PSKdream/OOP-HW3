/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dram-
 */
public class Mutator {
    String fristName, surName;
    public void set_fristName(String fristName){
        this.fristName = fristName;
    }
    public void set_surName(String surName){
        this.surName = surName;
    }
    public String getName() {
        return fristName + " " + surName;
    }
}
