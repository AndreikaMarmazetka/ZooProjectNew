package VeiwModel.Sevices.user.PaddookInfoCreated;

import DAO.create.CreateBDObject;
import Model.create.objects.CreateAnimalAndPaddook;
import Model.objects.Lists.Food;
import Model.objects.Lists.PaddookType;
import Model.objects.Lists.Types;

public class CreatePaddookService {


    public void create(int type, int food, boolean dengerous) {
        CreateAnimalAndPaddook createAnimalAndPaddook = new CreateAnimalAndPaddook();
        createAnimalAndPaddook.createPaddook(PaddookType.getInstance().getListTypePaddook(type),
                Food.getInstance().getFoodList(food), dengerous);
        int k = PaddookType.getInstance().getSizeList();
        new CreateBDObject().createPaddookBD(k, food+1, dengerous);
       // System.out.println( type);
        new CreateBDObject().CreatePaddok();

    }


}
