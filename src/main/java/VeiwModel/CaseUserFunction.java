package VeiwModel;


import Model.services.users.*;
import View.CreateAnimal;
import View.CreatePaddook;

public class CaseUserFunction extends ObjoctInOutWindow {
    public void setNumberFunction(int number) {
        switch (number) {
            case 0: {
                CreateAnimal ca = new CreateAnimal();
                ca.open();
            }
            case 1: {
                CreatePaddook cp = new CreatePaddook();
                cp.open();
            }
            case 2: {
                SearchService ss = SearchService.getInstance();
            }
            case 3: {
                BuyServices bs = BuyServices.getInstance();
            }
            case 4: {
                ReservationService rs = ReservationService.getInstance();
            }
            case 5: {
                CreateAnimalService cas = CreateAnimalService.getInstance();
            }
            case 6: {
                CreatePaddookService cps = CreatePaddookService.getInstance();

            }

            }
        }

    }
