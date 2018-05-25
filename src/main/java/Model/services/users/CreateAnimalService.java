package Model.services.users;

public class CreateAnimalService {
    private static CreateAnimalService ourInstance = new CreateAnimalService();

    public static CreateAnimalService getInstance() {
        return ourInstance;
    }

    private CreateAnimalService() {
    }
}
