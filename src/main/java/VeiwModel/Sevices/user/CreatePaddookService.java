package VeiwModel.Sevices.user;

import DAO.Connect.create.CreateBDObject;
import Model.create.objects.CreateAnimalAndPaddook;
import Model.objects.Lists.Food;
import Model.objects.Lists.PaddookType;

public class CreatePaddookService {
    private static CreatePaddookService ourInstance = new CreatePaddookService();

    public static CreatePaddookService getInstance() {
        return ourInstance;
    }

    private CreatePaddookService() {
    }

    public void Create(int type, int food, boolean dengerous) {
        CreateAnimalAndPaddook createAnimalAndPaddook = new CreateAnimalAndPaddook();
        createAnimalAndPaddook.createPaddook(PaddookType.getInstance().getListTypePaddook(type),
                Food.getInstance().getFoodList(food), dengerous);
        new CreateBDObject().createPaddookBD(type, food, dengerous);
        new CreateBDObject().CreatePaddok();

    }


}
