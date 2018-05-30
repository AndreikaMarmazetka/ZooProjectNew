package VeiwModel;


//import Model.services.users.*;

import VeiwModel.Sevices.user.*;
import VeiwModel.Sevices.user.AnimalInfoCreated.CreateAnimalService;
import VeiwModel.Sevices.user.AnimalInfoCreated.CreateTypeService;
import VeiwModel.Sevices.user.PaddookInfoCreated.CreatePaddookService;
import VeiwModel.Sevices.user.PaddookInfoCreated.CreatePaddookTypeService;
import View.CreateAnimal;
import View.CreatePaddook;

public class CaseUserFunction extends ObjectInOutWindow {
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
                SearchService ss = new SearchService();
            }
            case 3: {
                BuyServices bs = new BuyServices();
            }
            case 4: {
                ReservationService rs = new ReservationService();
            }
            case 5: {
                CreateAnimalService cas = new CreateAnimalService();
                new CreateTypeService().Create(sType);
                cas.createAnimal(iType, Integer.parseInt(sCost), iEnviroment, iPaddook, sTimeCareFirst, sTimeCareSecond, sTimeCareThird, sTimeCareFouth, sTimeCareFivth, sStatus, iStatusWay, iFood);
            }
            case 6: {
                CreatePaddookService cps = new CreatePaddookService();
                CreatePaddookTypeService cpts = new CreatePaddookTypeService();
                cpts.Create(sPaddookType);
                cps.Create(iType, iFood, bDagerous);
            }

            }
        }

    }
