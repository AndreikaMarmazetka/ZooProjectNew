package Model.objects;

import java.util.ArrayList;
import java.util.List;

public class ListTypePaddook {
    private List<String> ListTypePaddook = new ArrayList<String>();
    private static ListTypePaddook ourInstance = new ListTypePaddook();

    public static ListTypePaddook getInstance() {
        return ourInstance;
    }

    private ListTypePaddook() {
    }

    public int getSizeList() {
        return ListTypePaddook.size();
    }

    public String getListTypePaddook(int i) {
        return ListTypePaddook.get(i);
    }

    public void AddListTypePaddook(String str) {
        ListTypePaddook.add(str);
    }
}
