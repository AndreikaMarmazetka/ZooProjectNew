package Model.objects.Lists;

import java.util.ArrayList;
import java.util.List;

public class Types {
    public  List<String> typesList = new ArrayList<String>();
    private static Types ourInstance = new Types();

    public static Types getInstance() {
        return ourInstance;
    }

    private Types() {
    }

    public int getSizeList() {
        return typesList.size();
    }

    public String getTypesList(int i) {
        return typesList.get(i);
    }

    public void addListTypes(String str) {
        typesList.add(str);
    }
}
