package Model.objects;

import java.lang.String;
import java.sql.Time;
import java.util.List;

public class Animal {
    protected String type;
    protected int cost;
    protected String enviromentType;
    protected Paddook paddookType;
    protected List<Time> timingForCare;
    protected String status;
    protected String statusWay;
    protected String foodType;


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
