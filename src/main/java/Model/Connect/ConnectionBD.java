package Model.Connect;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConnectionBD {
    private static ConnectionBD ourInstance = new ConnectionBD();

    public static ConnectionBD getInstance() {
        return ourInstance;
    }

    private ConnectionBD() {
    }

    public boolean Connect() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/Zoo",
                    "postgres", "12345678");
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionBD.class.getName()).log(
                    Level.SEVERE, null, ex);
        }

        if (null != connection) {
            System.out.println("------ Подключение установлено ------");
            return true;
        } else {
            System.out.println("------ Подключение НЕ установлено ------");
            return false;
        }


    }
}

