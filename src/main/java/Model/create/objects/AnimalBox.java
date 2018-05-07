package Model.create.objects;

import Model.objects.Animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalBox {
    private List<Animal> ListAnimals = new ArrayList<Animal>();
    private static AnimalBox ourInstance = new AnimalBox();

    public static AnimalBox getInstance() {
        return ourInstance;
    }

    private AnimalBox() {
    }

    public int getSizeList() {
        return ListAnimals.size();
    }

    public Animal getListAnimal(int i) {
        return ListAnimals.get(i);
    }

    public void AddListAnimal(Animal animal) {
        ListAnimals.add(animal);
    }
}
