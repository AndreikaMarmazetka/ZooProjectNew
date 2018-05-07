package Model.objects.Lists.animals;

import java.util.ArrayList;
import java.util.List;

public class Status {
    private List<String> statusesList = new ArrayList<String>();
    private static Status ourInstance = new Status();

    public static Status getInstance() {
        return ourInstance;
    }

    private Status() {
    }

    public int getSizeList() {
        return statusesList.size();
    }

    public String getStatusesList(int i) {
        return statusesList.get(i);
    }

    public void AddListStatuses(String str) {
        statusesList.add(str);
    }
}
