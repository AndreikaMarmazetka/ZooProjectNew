package Model.objects.Lists.animals;

import java.util.ArrayList;
import java.util.List;

public class Enviroments {
    private List<String> enviromentsList = new ArrayList<String>();
    private static Enviroments ourInstance = new Enviroments();

    public static Enviroments getInstance() {
        return ourInstance;
    }

    private Enviroments() {
    }

    public int getSizeList() {
        return enviromentsList.size();
    }

    public String getListEnvironment(int i) {
        return enviromentsList.get(i);
    }

    public void AddListEnvironment(String str) {
        enviromentsList.add(str);
    }
}
