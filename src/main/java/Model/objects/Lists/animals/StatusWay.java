package Model.objects.Lists.animals;

public enum StatusWay {
    inZoo("Have"),
    OneDay("1 day"),
    TwoDay("2 days"),
    ThreeDay("3 days"),
    FourDay("4 days"),
    FiveDay("5 days"),
    SixDay("6 days"),
    SevenDay("7 days"),
    inWorld("Haven`t");

    private String s;

    StatusWay(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return s;
    }
}
