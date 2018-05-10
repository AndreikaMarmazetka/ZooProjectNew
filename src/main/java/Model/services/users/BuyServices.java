package Model.services.users;

import Model.create.objects.AnimalBox;


public class BuyServices {
    AnimalBox animalBox = AnimalBox.getInstance();
    private static BuyServices ourInstance = new BuyServices();

    public static BuyServices getInstance() {
        return ourInstance;
    }

    private BuyServices() {
    }

    public void buy(int index) {
        
    }
}
