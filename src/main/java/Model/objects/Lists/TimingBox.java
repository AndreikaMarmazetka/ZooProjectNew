package Model.objects.Lists;

import Model.objects.Timing;

import java.util.ArrayList;
import java.util.List;

public class TimingBox {
    private List<Timing> TimingList = new ArrayList<Timing>();
    private static TimingBox ourInstance = new TimingBox();

    public static TimingBox getInstance() {
        return ourInstance;
    }

    private TimingBox() {
    }

    public int getSizeList() {
        return TimingList.size();
    }

    public Timing getListTiming(int i) {
        return TimingList.get(i);
    }

    public void addListTiming(Timing timing) {
        TimingList.add(timing);
    }
}
