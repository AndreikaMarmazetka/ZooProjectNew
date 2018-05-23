package Model.Connect.load;

import Model.Connect.ConnectionBD;
import Model.Connect.Query;
import Model.create.objects.CreateAnimalAndPaddook;
import Model.objects.Lists.*;
import Model.objects.Timing;

import java.sql.ResultSet;
import java.sql.SQLException;


public class FirstLoad {
    public void loadObjects() {
        ConnectionBD newConnection = ConnectionBD.getInstance();
        newConnection.Connect();
        try {
            java.sql.Statement st = newConnection.getConnection().createStatement();
            ResultSet rs = st.executeQuery(Query.loadAnimal);
            loadAnimal(rs);
            rs = st.executeQuery(Query.loadPaddook);
            loadPaddook(rs);
            rs = st.executeQuery(Query.loadAnimalType);
            loadAnimalType(rs);
            rs = st.executeQuery(Query.loadTiming);
            loadTiming(rs);
            rs = st.executeQuery(Query.loadStatusWay);
            loadStatusWay(rs);
            rs = st.executeQuery(Query.loadFood);
            loadFood(rs);
            rs = st.executeQuery(Query.loadEnviroment);
            loadEnviroment(rs);
            rs = st.executeQuery(Query.loadPaddookType);
            loadPaddookType(rs);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void loadAnimal(ResultSet rs) throws SQLException {
        CreateAnimalAndPaddook createAnimal = new CreateAnimalAndPaddook();
        while (rs.next()) {
            createAnimal.createAnimal(rs.getString(1), rs.getInt(2), rs.getString(3), rs.getString(4),
                    rs.getTime(5), rs.getTime(6), rs.getTime(7), rs.getTime(8), rs.getTime(9),
                    rs.getString(10), rs.getString(11), rs.getString(12));
        }
    }

    public void loadPaddook(ResultSet rs) throws SQLException {
        CreateAnimalAndPaddook createPaddook = new CreateAnimalAndPaddook();
        while (rs.next()) {
            createPaddook.createPaddook(rs.getString(1), rs.getString(2), rs.getBoolean(3));
        }
    }

    public void loadAnimalType(ResultSet rs) throws SQLException {
        AnimalType at = AnimalType.getInstance();
        while (rs.next()) {
            at.addListTypeAnimal(rs.getString(1));
        }
    }

    public void loadTiming(ResultSet rs) throws SQLException {
        TimingBox tb = TimingBox.getInstance();
        Timing t = new Timing();
        while (rs.next()) {
            t.setFirst(rs.getTime(1));
            t.setSecond(rs.getTime(2));
            t.setThird(rs.getTime(3));
            t.setFource(rs.getTime(4));
            t.setFifth(rs.getTime(5));
            tb.addListTiming(t);
        }
    }

    public void loadStatusWay(ResultSet rs) throws SQLException {
        StatusWay sw = StatusWay.getInstance();
        while (rs.next()) {
            sw.addListStatuses(rs.getString(1));
        }
    }

    public void loadFood(ResultSet rs) throws SQLException {
        Food f = Food.getInstance();
        while (rs.next()) {
            f.addFoodList(rs.getString(1));
        }
    }

    public void loadEnviroment(ResultSet rs) throws SQLException {
        Enviroments e = Enviroments.getInstance();
        while (rs.next()) {
            e.addListEnvironment(rs.getString(1));
        }
    }

    public void loadPaddookType(ResultSet rs) throws SQLException {
        PaddookType e = PaddookType.getInstance();
        while (rs.next()) {
            e.addListTypePaddook(rs.getString(1));
        }
    }
}
