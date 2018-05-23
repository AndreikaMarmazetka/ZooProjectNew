package Model.Connect.create;

import Model.Connect.ConnectionBD;
import Model.Connect.Query;
import Model.objects.Animal;
import Model.objects.Lists.AnimalType;
import Model.objects.Lists.TimingBox;
import Model.objects.Timing;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CreateBDObject {
    ConnectionBD connectionBD = ConnectionBD.getInstance();
    java.sql.Statement st;
    Query query = new Query();

    {
        try {
            st = connectionBD.getConnection().createStatement();
            st.execute()
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void createAnimalBD(Animal animal) {

        query.createAddPaddookTypeQuery();
    }

    public void createAnimalTypeBD(Animal animal) {
        AnimalType at = AnimalType.getInstance();
        query.createAddAnimalTypeQuery(at.getSizeList(), animal.getType());
    }

    public void createTimingBD(Animal animal) {
        TimingBox tb = TimingBox.getInstance();
        Timing t;
        t = animal.getTimingForCare();
        query.createAddTiming(tb.getSizeList(), t.getFirst(), t.getSecond(), t.getThird(), t.getFource(), t.getFifth());
    }
}
