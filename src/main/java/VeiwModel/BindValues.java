package VeiwModel;

import Model.objects.Lists.Food;
import View.CreatePaddook;

import javax.swing.*;

public class BindValues extends ObjectInOutWindow{

    public void bindValueCreatePaddook(){
        sPaddookType =new CreatePaddook().textEditType.toString();
        iFood = new CreatePaddook().comboBoxFood.getSelectedIndex();
        bDagerous = new CreatePaddook().dangerousCheckBox.isSelected();
    }


    public void bindValueComboBoxFood(JComboBox cb){
        Food f= Food.getInstance();
        int i=0;
        while (i<f.getSizeList()){
            cb.addItem(f.getFoodList(i));
            System.out.println(f.getFoodList(i));
            i++;
        }
    }

}
