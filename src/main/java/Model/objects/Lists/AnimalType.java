package Model.objects.Lists;

import java.util.ArrayList;
import java.util.List;

public class AnimalType {
    private List<String> AnimalTypeList = new ArrayList<String>();
    private static AnimalType ourInstance = new AnimalType();

    public static AnimalType getInstance() {
        return ourInstance;
    }

    private AnimalType() {
    }

    public int getSizeList() {
        return AnimalTypeList.size();
    }

    public String getAnimalTypeList(int i) {
        return AnimalTypeList.get(i);
    }

    public void addListTypeAnimal(String str) {
        AnimalTypeList.add(str);
    }
}
