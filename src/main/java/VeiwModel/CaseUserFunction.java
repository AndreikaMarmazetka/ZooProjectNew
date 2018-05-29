package VeiwModel;


import Model.services.users.*;
import Sevices.user.*;
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
                cas.createAnimal(iType, Integer.parseInt(sCost), iEnviroment, iPaddook, sTime1, sTime2, sTime3, sTime4, sTime5, sStatus, iStatusWay, iFood);
            }
            case 6: {
                CreatePaddookService cps = CreatePaddookService.getInstance();
                CreatePaddookTypeService cpts = CreatePaddookTypeService.getInstance();
                new BindValues().bindValueCreatePaddook();
                cpts.Create(sPaddookType);
                cps.Create(iType, iFood, bDagerous);
            }

            }
        }

    }
