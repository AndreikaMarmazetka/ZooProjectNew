package Model.objects.Lists.animals;

public enum FoodType {
    Herbivorous("Herbivorous"),
    Predator("Predator"),
    Omnivorous("Omnivorous");

    private String s;

    FoodType(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return s;
    }
}
