package VeiwModel.Sevices.user.AnimalInfoCreated;

import Model.objects.Lists.Types;

public class CreateTypeService {
    public void Create(String str) {
        if (str.equals("") || str.equals(null)) {
        } else {
            Types types = new Types();
            types.addListTypes(str);
        }
    }
}
