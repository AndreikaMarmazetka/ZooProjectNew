package Model.objects.info.paddook;

public enum PaddookType {
    VoliaryWater("Voliary water"),
    VoliarySnow("Voliary snow"),
    VoliaryWet("Voliary wet"),
    VoliarySand("Voliary sand"),
    VoliaryBird("Voliary bird"),
    Terrarium("Terrarium"),
    Aquarium("Aquarium");


    private String s;

    PaddookType(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return s;
    }
}
