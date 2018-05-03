package Model.objects.info.paddook;

public enum PaddookFood {
    Herbivorous("Herbivorous"),
    Predator("Predator"),
    Omnivorous("Omnivorous");

    private String s;

    PaddookFood(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return s;
    }
}
