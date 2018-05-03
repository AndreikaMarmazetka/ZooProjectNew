package Model.objects;

import java.util.List;

public abstract class Paddook {
    private String type;
    private String food;
    private boolean dengerous;
    private List<Animal> compability;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public boolean isDengerous() {
        return dengerous;
    }

    public void setDengerous(boolean dengerous) {
        this.dengerous = dengerous;
    }

    public List<Animal> getCompability() {
        return compability;
    }

    public void setCompability(List<Animal> compability) {
        this.compability = compability;
    }
}
