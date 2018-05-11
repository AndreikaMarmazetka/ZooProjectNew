package Model.objects.Lists;

import java.util.ArrayList;
import java.util.List;

public class Food {
    private List<String> FoodList = new ArrayList<String>();
    private static Food ourInstance = new Food();

    public static Food getInstance() {
        return ourInstance;
    }

    private Food() {
    }

    public int getSizeList() {
        return FoodList.size();
    }

    public String getFoodList(int i) {
        return FoodList.get(i);
    }

    public void addFoodList(String str) {
        FoodList.add(str);
    }
}
