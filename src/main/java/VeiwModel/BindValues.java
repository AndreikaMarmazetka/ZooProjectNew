package VeiwModel;

import Model.create.objects.AnimalBox;
import Model.create.objects.PaddookBox;
import Model.objects.Lists.Enviroments;
import Model.objects.Lists.Food;
import Model.objects.Lists.StatusWay;
import View.CreatePaddook;

import javax.swing.*;

public class BindValues extends ObjectInOutWindow {

    public void bindValueCreatePaddook() {
        sPaddookType = new CreatePaddook().textEditType.toString();
        iFood = new CreatePaddook().comboBoxFood.getSelectedIndex();
        bDagerous = new CreatePaddook().dangerousCheckBox.isSelected();
    }


    public void bindValueComboBoxFood(JComboBox cb) {
        Food f = Food.getInstance();
        int i = 0;
        while (i < f.getSizeList()) {
            cb.addItem(f.getFoodList(i));
            i++;
        }
    }

    public void bindValueComboBoxEnviroment(JComboBox cb) {
        Enviroments e = Enviroments.getInstance();
        int i = 0;
        while (i < e.getSizeList()) {
            cb.addItem(e.getListEnvironment(i));
            i++;
        }
    }

    public void bindValueComboBoxPaddook(JComboBox cb) {
        PaddookBox pb = PaddookBox.getInstance();
        int i = 0;
        while (i < pb.getSizeList()) {
            cb.addItem(pb.getListPaddook(i).getType());
            i++;
        }
    }

    public void bindValueComboBoxType(JComboBox cb) {
        AnimalBox ab = AnimalBox.getInstance();
        int i = 0;
        while (i < ab.getSizeList()) {
            cb.addItem(ab.getListAnimal(i).getType());
            i++;
        }
    }

    public void bindValueComboBoxStatusWay(JComboBox cb) {
        StatusWay ab = StatusWay.getInstance();
        int i = 0;
        while (i < ab.getSizeList()) {
            cb.addItem(ab.getStatusesList(i));
            i++;
        }
    }

}
