package Model.Connect.load;

import Model.Connect.ConnectionBD;
import Model.Connect.Query;

public class FirstLoad {
    public void loadObjects() {
        ConnectionBD newConnection = ConnectionBD.getInstance();
        if (newConnection.Connect()) {

            //System.out.println("------ Подключение установлено ------");
        }
    }

}
