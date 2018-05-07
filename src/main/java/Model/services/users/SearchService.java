package Model.services.users;

public class SearchService {

    private static SearchService ourInstance = new SearchService();

    public static SearchService getInstance() {
        return ourInstance;
    }

    private SearchService() {
    }


}
