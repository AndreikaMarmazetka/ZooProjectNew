package Model.Connect.load;

import Model.Connect.ConnectionBD;
import Model.Connect.Query;
import Model.create.objects.AnimalBox;
import Model.create.objects.CreateAnimalAndPaddook;

import java.beans.Statement;
import java.sql.DriverManager;
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
}
