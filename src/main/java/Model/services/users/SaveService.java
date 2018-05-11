package Model.services.users;

public class SaveService {
    private static SaveService ourInstance = new SaveService();

    public static SaveService getInstance() {
        return ourInstance;
    }

    private SaveService() {

    }
}
