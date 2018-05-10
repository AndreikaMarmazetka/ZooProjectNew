package Model.services.users;

import Model.Connect.ConnectionBD;

public class SearchService {

    private static SearchService ourInstance = new SearchService();

    public static SearchService getInstance() {
        return ourInstance;
    }

    private SearchService() {
    }

    ConnectionBD connect1 = ConnectionBD.getInstance();
    String query = "Select * from Animal a where a.type=\"strtype\" ";

}