package Model.objects.Lists;

import java.util.ArrayList;
import java.util.List;

public class PaddookType {
    private List<String> ListTypePaddook = new ArrayList<String>();
    private static PaddookType ourInstance = new PaddookType();

    public static PaddookType getInstance() {
        return ourInstance;
    }

    private PaddookType() {
    }

    public int getSizeList() {
        return ListTypePaddook.size();
    }

    public String getListTypePaddook(int i) {
        return ListTypePaddook.get(i);
    }

    public void addListTypePaddook(String str) {
        ListTypePaddook.add(str);
    }
}
