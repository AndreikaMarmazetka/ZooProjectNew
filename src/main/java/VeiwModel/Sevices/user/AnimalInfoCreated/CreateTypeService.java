package VeiwModel.Sevices.user.AnimalInfoCreated;

import DAO.create.CreateBDObject;
import Model.objects.Lists.Types;

public class CreateTypeService {
    public void Create(String str) {
        if (str.equals("") || str.equals(null)) {
        } else {
            Types types = Types.getInstance();
            types.addListTypes(str);
            CreateBDObject createBDObject = new CreateBDObject();
            createBDObject.createAnimalTypeBD(str);
        }
    }
}
