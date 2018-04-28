package com.example.demo.objects;

import com.example.demo.objects.info.animal.Type;

import java.lang.String;
import java.sql.Time;
import java.util.List;

public abstract class Animal {
    private String type;
    private int cost;
    private String enviromentType;
    private Paddook paddookType;
    private List<Time> timingForCare;
    private String status;
    private String statusWay;
    private String foodType;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getEnviromentType() {
        return enviromentType;
    }

    public void setEnviromentType(String enviromentType) {
        this.enviromentType = enviromentType;
    }

    public Paddook getPaddookType() {
        return paddookType;
    }

    public void setPaddookType(Paddook paddookType) {
        this.paddookType = paddookType;
    }

    public List<Time> getTimingForCare() {
        return timingForCare;
    }

    public void setTimingForCare(List<Time> timingForCare) {
        this.timingForCare = timingForCare;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusWay() {
        return statusWay;
    }

    public void setStatusWay(String statusWay) {
        this.statusWay = statusWay;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

}
