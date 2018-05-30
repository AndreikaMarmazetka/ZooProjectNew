package VeiwModel.Sevices.user;

import DAO.ConnectionBD;

public class SearchService {


    ConnectionBD connect1 = ConnectionBD.getInstance();
    String query = "Select * from Animal a where a.type=\"strtype\" ";

}
