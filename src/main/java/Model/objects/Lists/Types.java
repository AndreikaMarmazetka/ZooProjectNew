package Model.objects.Lists;

import java.util.ArrayList;
import java.util.List;

public class Types {
    public final List<String> typesList = new ArrayList<String>();


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
