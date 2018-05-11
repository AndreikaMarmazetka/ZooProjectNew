package Model.objects;

import java.sql.Time;

public class Timing {
    protected int idTime;
    protected Time first;
    protected Time second;
    protected Time third;
    protected Time fource;

    public int getIdTime() {
        return idTime;
    }

    public void setIdTime(int idTime) {
        this.idTime = idTime;
    }

    public Time getFirst() {
        return first;
    }

    public void setFirst(Time first) {
        this.first = first;
    }

    public Time getSecond() {
        return second;
    }

    public void setSecond(Time second) {
        this.second = second;
    }

    public Time getThird() {
        return third;
    }

    public void setThird(Time third) {
        this.third = third;
    }

    public Time getFource() {
        return fource;
    }

    public void setFource(Time fource) {
        this.fource = fource;
    }

    public Time getFifth() {
        return fifth;
    }

    public void setFifth(Time fifth) {
        this.fifth = fifth;
    }

    protected Time fifth;
}
