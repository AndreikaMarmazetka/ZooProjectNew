package View;

import VeiwModel.BindValues;
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
    public JButton createButtonPaddook;
    public JTextField textFieldTimeCareFirst;
    public JTextField textFieldTimeCareSecond;
    public JTextField textFieldTimeCareThird;
    public JTextField textFieldTimeCareFouth;
    public JTextField textFieldTimeCareFivth;
    public JTextArea textStatus;
    public JComboBox comboBoxStatusWay;
    public JComboBox comboBoxAnimalFood;

    public CreateAnimal() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        new BindValues().bindValueComboBoxFood(comboBoxAnimalFood);
        new BindValues().bindValueComboBoxEnviroment(comboBoxEnviroment);
        new BindValues().bindValueComboBoxPaddook(comboBoxPaddook);
        new BindValues().bindValueComboBoxType(comboBoxType);
        new BindValues().bindValueComboBoxStatusWay(comboBoxStatusWay);

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
        new BindValues().bindValueCreateAnimal(this);
        new CaseUserFunction().setNumberFunction(13);
        dispose();
    }

    private void onCancel() {
        dispose();
    }

    public void open() {
        CreateAnimal dialog = new CreateAnimal();
        dialog.pack();
        dialog.setVisible(true);
    }


}
