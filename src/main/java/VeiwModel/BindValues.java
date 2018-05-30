package VeiwModel;

import Model.create.objects.AnimalBox;
import Model.create.objects.PaddookBox;
import Model.objects.Lists.Enviroments;
import Model.objects.Lists.Food;
import Model.objects.Lists.StatusWay;
import View.CreateAnimal;
import View.CreatePaddook;
import View.SearchAnimal;

import javax.swing.*;

public class BindValues extends ObjectInOutWindow{

    public void bindValueCreatePaddook(CreatePaddook createPaddok) {
        sPaddookType = createPaddok.textEditType.getText();
        iFood = createPaddok.comboBoxFood.getSelectedIndex();
        bDagerous = createPaddok.dangerousCheckBox.isSelected();
    }

    public void bindValueCreateAnimal(CreateAnimal createAnimal) {
        sType = createAnimal.textFieldType.getText();
        iType = createAnimal.comboBoxType.getSelectedIndex();
        sCost = createAnimal.textFieldCost.getText();
        iEnviroment = createAnimal.comboBoxEnviroment.getSelectedIndex();
        iPaddook = createAnimal.comboBoxPaddook.getSelectedIndex();
        sPaddookType = createAnimal.textFieldPadook.getText();
        sTimeCareFirst = createAnimal.textFieldTimeCareFirst.getText();
        sTimeCareSecond = createAnimal.textFieldTimeCareSecond.getText();
        sTimeCareThird = createAnimal.textFieldTimeCareThird.getText();
        sTimeCareFouth = createAnimal.textFieldTimeCareFouth.getText();
        sTimeCareFivth = createAnimal.textFieldTimeCareFivth.getText();
        sStatus = createAnimal.textStatus.getText();
        iStatusWay = createAnimal.comboBoxStatusWay.getSelectedIndex();
        iFood = createAnimal.comboBoxAnimalFood.getSelectedIndex();
    }

    public void bindValueSearchAnimal(SearchAnimal searchAnimal) {
        sType = searchAnimal.textFieldSearchType.getText();
        sCost = searchAnimal.textFieldSearchMinimalCost.getText();
        sMaximumCost = searchAnimal.textFieldSearchMaximalCost.getText();
        iEnviroment = searchAnimal.comboBoxSearchEnviroment.getSelectedIndex();
        iPaddook = searchAnimal.comboBoxSearchPaddook.getSelectedIndex();
        iStatusWay = searchAnimal.comboBoxSearchStatusWay.getSelectedIndex();
        iFood = searchAnimal.comboBoxSearchFood.getSelectedIndex();
    }

    public void bindValueComboBoxFood(JComboBox cb){
        Food f= Food.getInstance();
        int i=0;
        while (i<f.getSizeList()){
            cb.addItem(f.getFoodList(i));
            i++;
        }
    }

    public void bindValueComboBoxEnviroment(JComboBox cb){
        Enviroments e= Enviroments.getInstance();
        int i=0;
        while (i<e.getSizeList()){
            cb.addItem(e.getListEnvironment(i));
            i++;
        }
    }

    public void bindValueComboBoxPaddook(JComboBox cb){
        PaddookBox pb = PaddookBox.getInstance();
        int i=0;
        while (i<pb.getSizeList()){
            cb.addItem(pb.getListPaddook(i).getType());
            i++;
        }
    }

    public void bindValueComboBoxType(JComboBox cb){
        AnimalBox ab = AnimalBox.getInstance();
        int i=0;
        while (i<ab.getSizeList()){
            cb.addItem(ab.getListAnimal(i).getType());
            i++;
        }
    }

    public void bindValueComboBoxStatusWay(JComboBox cb){
        StatusWay ab = StatusWay.getInstance();
        int i=0;
        while (i<ab.getSizeList()){
            cb.addItem(ab.getStatusesList(i));
            i++;
        }
    }

}
