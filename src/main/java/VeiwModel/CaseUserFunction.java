package VeiwModel;


//import Model.services.users.*;

import Model.objects.Lists.PaddookType;
import Model.objects.Lists.Types;
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
            case 13: {
                CreateAnimalService cas = new CreateAnimalService();
                if ( iType == 0) {
                    new CreateTypeService().Create(sType);
                    iType = Types.getInstance().getSizeList()-1;
                    System.out.println("if");
                }
                    cas.createAnimal(iType, Integer.parseInt(sCost), iEnviroment, iPaddook, sTimeCareFirst, sTimeCareSecond,
                            sTimeCareThird, sTimeCareFouth, sTimeCareFivth, sStatus, iStatusWay, iFood);
                    System.out.println("else");

            }
            case 6: {
                if(sPaddookType.equals("")){
                    System.out.println("if6");
                }
                else {
                    System.out.println("else6");
                    CreatePaddookService cps = new CreatePaddookService();
                    CreatePaddookTypeService cpts = new CreatePaddookTypeService();
                    cpts.Create(sPaddookType);
                    cps.create(PaddookType.getInstance().getSizeList() - 1, iFood, bDagerous);
                }

            }

            }
        }

    }
