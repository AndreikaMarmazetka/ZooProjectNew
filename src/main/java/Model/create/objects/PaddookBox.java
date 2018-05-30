package Model.create.objects;

import Model.objects.Paddook;

import java.util.ArrayList;
import java.util.List;

public class PaddookBox {
    private List<Paddook> ListPaddook = new ArrayList<Paddook>();
    private static PaddookBox ourInstance = new PaddookBox();

    public static PaddookBox getInstance() {
        return ourInstance;
    }

    private PaddookBox() {
    }

    public int getSizeList() {
        return ListPaddook.size();
    }

    public Paddook getListPaddook(int i) {
        return ListPaddook.get(i);
    }

    public void addListPaddook(Paddook paddook) {
        ListPaddook.add(paddook);
    }

}
