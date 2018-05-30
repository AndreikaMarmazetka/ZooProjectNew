package View;

import VeiwModel.BindValues;
import VeiwModel.CaseUserFunction;
import VeiwModel.Sevices.user.SearchService;

import javax.swing.*;
import java.awt.event.*;

public class SearchAnimal extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    public JTextField textFieldSearchType;
    public JTextField textFieldSearchMinimalCost;
    public JTextField textFieldSearchMaximalCost;
    public JComboBox comboBoxSearchEnviroment;
    public JComboBox comboBoxSearchPaddook;
    public JComboBox comboBoxSearchStatusWay;
    public JComboBox comboBoxSearchFood;

    public SearchAnimal() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        setSize(300, 400);
        new BindValues().bindValueComboBoxFood(comboBoxSearchFood);
        new BindValues().bindValueComboBoxEnviroment(comboBoxSearchEnviroment);
        new BindValues().bindValueComboBoxPaddook(comboBoxSearchPaddook);
        new BindValues().bindValueComboBoxFood(comboBoxSearchFood);

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



    }

    private void onOK() {
        new BindValues().bindValueSearchAnimal(this);
        new CaseUserFunction().setNumberFunction(2);
        dispose();
    }

    private void onCancel() {
        dispose();
    }

    public static void open() {
        SearchAnimal dialog = new SearchAnimal();
        dialog.pack();
        dialog.setVisible(true);
    }
}
