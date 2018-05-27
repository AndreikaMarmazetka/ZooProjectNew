package View;

import Model.objects.Lists.Food;
import VeiwModel.CaseUserFunction;

import javax.swing.*;
import java.awt.event.*;

public class CreateAnimal extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    public JComboBox comboBoxType;
    public JTextField textFieldType;
    public JTextField textFieldCost;
    public JComboBox comboBoxEnviroment;
    public JComboBox comboBoxPaddook;
    public JTextField textFieldPadook;
    public JButton createButtonPaddook;
    public JTextField textFieldTime1;
    public JTextField textFieldTime2;
    public JTextField textFieldTime3;
    public JTextField textFieldTime4;
    public JTextField textFieldTime5;
    public JTextArea textStatus;
    public JComboBox comboBoxStatusWay;
    public JComboBox comboBoxFood;

    public CreateAnimal() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        //Food f = Food.getInstance();
        //for(int i=0; i<=f.getSizeList()-1;i++)
        //comboBoxFood.addItem(f.getFoodList(i));
        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });


        createButtonPaddook.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                oncreateButtonPaddook();
            }
        });
    }

    private void oncreateButtonPaddook() {
        new CreatePaddook().open();
    }

    private void onOK() {
        comboBoxType.getSelectedIndex();
        dispose();
    }

    private void onCancel() {
        dispose();
    }

    public static void open() {
        CreateAnimal dialog = new CreateAnimal();
        dialog.pack();
        dialog.setVisible(true);
    }


}
