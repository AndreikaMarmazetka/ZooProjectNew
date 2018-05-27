package Model.services.users;

import Model.Connect.create.CreateBDObject;
import Model.objects.Lists.PaddookType;

public class CreatePaddookTypeService {
    private static CreatePaddookTypeService ourInstance = new CreatePaddookTypeService();

    public static CreatePaddookTypeService getInstance() {
        return ourInstance;
    }

    private CreatePaddookTypeService() {
    }

    public void Create(String str) {
        if (str.equals("")) {
        } else {
            PaddookType paddookType = PaddookType.getInstance();
            CreateBDObject createType = new CreateBDObject();
            paddookType.addListTypePaddook(str);
            createType.createPadookTypeBD(str);
        }
    }
}
