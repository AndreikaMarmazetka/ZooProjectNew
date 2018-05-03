package Model.objects.info.animal;


import java.lang.String;

public enum StatusWay {
    OneDay("1 day"),
    TwoDay("2 days"),
    ThreeDay("3 days"),
    FourDay("4 days"),
    FiveDay("5 days"),
    SixDay("6 days"),
    SevenDay("7 days");

    private String s;

    StatusWay(String s) {
        this.s = s;
    }

    @Override
    public String toString(){
        return s;
    }
}
