package DAO.Connect.create;

import DAO.Connect.ConnectionBD;
import DAO.Connect.Query;
import Model.create.objects.AnimalBox;
import Model.create.objects.PaddookBox;
import Model.objects.Animal;
import Model.objects.Lists.AnimalType;
import Model.objects.Lists.PaddookType;
import Model.create.objects.TimingBox;
import Model.objects.Timing;

import java.sql.SQLException;

public class CreateBDObject {
    Query query = new Query();
    ConnectionBD connectionBD = ConnectionBD.getInstance();

    public void CreatePaddok() {
        java.sql.Statement st;
        {
            try {
                connectionBD.Connect();
                st = connectionBD.getConnection().createStatement();
                st.executeUpdate(Query.loadPaddookType);
                st.executeUpdate(Query.loadPaddook);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    public void createAnimalBD(int type, int cost, int enviroment, int padook, int timing, String status, int status_way, int food) {
        AnimalBox ab = AnimalBox.getInstance();
        query.createAddAnimalQuery(ab.getSizeList(), type, cost, enviroment, padook, timing, status, status_way, food);
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

    public void createPaddookBD(int type, int food, boolean dengerous) {
        PaddookBox pb = PaddookBox.getInstance();
        query.createAddPaddookQuery(pb.getSizeList(), type, food, dengerous);
    }

    public void createPadookTypeBD(String type) {
        PaddookType pt = PaddookType.getInstance();
        query.createAddPaddookTypeQuery(pt.getSizeList(), type);
    }
}
