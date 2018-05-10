package Model.Connect;

import Model.create.objects.CreateAnimalAndPaddook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionBD {
    private static ConnectionBD ourInstance = new ConnectionBD();

    public static ConnectionBD getInstance() {
        return ourInstance;
    }

    private ConnectionBD() {
    }

    CreateAnimalAndPaddook create = new CreateAnimalAndPaddook();
    Statement stmt;
    Statement stmt2;
    public void Connect() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/Zoo",
                    "postgres", "12345678");

            stmt = connection.createStatement();
            String query = "";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                // create.createAnimal(rs.getString(1),rs.getInt(2),rs.getString(3),rs.getString(4));
            }

            String query2 = "";
            ResultSet rs2 = stmt2.executeQuery(query2);
            while (rs2.next()) {
                // create.createPaddook(rs.getString(1),rs.getInt(2),rs.getString(3),rs.getString(4));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionBD.class.getName()).log(
                    Level.SEVERE, null, ex);
        }

        if (null != connection) {
            System.out.println("------ Подключение установлено ------");
        } else {
            System.out.println("------ Подключение НЕ установлено ------");
        }


    }
}

