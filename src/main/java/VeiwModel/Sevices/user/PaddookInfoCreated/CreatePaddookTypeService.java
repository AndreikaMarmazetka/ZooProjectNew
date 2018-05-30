package VeiwModel.Sevices.user.PaddookInfoCreated;

import DAO.create.CreateBDObject;
import Model.objects.Lists.PaddookType;

public class CreatePaddookTypeService {

    public void Create(String str) {
        if (str.equals("")) {
            System.out.println("adll");
        } else {
            PaddookType paddookType = PaddookType.getInstance();
            CreateBDObject createType = new CreateBDObject();
            paddookType.addListTypePaddook(str);
            createType.createPadookTypeBD(str);
        }
    }
}
