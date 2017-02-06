package com.example.myapplication;

import java.io.Serializable;

/**
 * Created by Victor on 2017-02-04.
 */

/**
 * Person class stores data with setters and getters, serializable
 */
public class Person implements Serializable{

    /**
     * Person data
     */
    private String name;
    private String date;
    private double neckSize;
    private double bustSize;
    private double chestSize;
    private double waistSize;
    private double hipSize;
    private double inseamSize;
    private String inputComment;

    /**
     * Person setters
     */
    public void setDate(String date) {
        this.date = date;
    }
    public void setNeckSize(Double neckSize) {this.neckSize = neckSize;}
    public void setBustSize(Double bustSize) {this.bustSize = bustSize;}
    public void setChestSize(Double chestSize) {this.chestSize = chestSize;}
    public void setWaistSize(Double waistSize) {this.waistSize = waistSize;}
    public void setHipSize(Double hipSize) {this.hipSize = hipSize;}
    public void setInseamSize(Double inseamSize) {this.inseamSize = inseamSize;}
    public void setInputComment(String inputComment) {this.inputComment = inputComment;}

    /**
     * Person getters
     */
    public String getName() {
        return name;
    }
    public String getDate() {
        return date;
    }
    public double getNeckSize() {
        return neckSize;
    }
    public double getBustSize() {
        return bustSize;
    }
    public double getChestSize() {
        return chestSize;
    }
    public double getWaistSize() {
        return waistSize;
    }
    public double getHipSize() {
        return hipSize;
    }
    public double getInseamSize() {
        return inseamSize;
    }
    public String getInputComment() {
        return inputComment;
    }

    /**
     * Create person element requires name element
     * @param Name
     */
    public Person(String Name){
        this.name = Name;
    }
}
