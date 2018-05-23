package Model.objects.Lists;

import java.util.ArrayList;
import java.util.List;

public class StatusWay {
    private List<String> statusesList = new ArrayList<String>();
    private static StatusWay ourInstance = new StatusWay();

    public static StatusWay getInstance() {
        return ourInstance;
    }

    private StatusWay() {
    }

    public int getSizeList() {
        return statusesList.size();
    }

    public String getStatusesList(int i) {
        return statusesList.get(i);
    }

    public void addListStatuses(String str) {
        statusesList.add(str);
    }
}
