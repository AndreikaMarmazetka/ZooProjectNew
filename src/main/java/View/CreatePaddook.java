package View;

import VeiwModel.BindValues;
import VeiwModel.CaseUserFunction;

import javax.swing.*;
import java.awt.event.*;

public class CreatePaddook extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    public JCheckBox dangerousCheckBox;
    public JTextField textEditType;
    public JComboBox comboBoxFood;

    public CreatePaddook() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        new BindValues().bindValueComboBoxFood(comboBoxFood);
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
        new BindValues().bindValueCreatePaddook(this);
        new CaseUserFunction().setNumberFunction(6);

        dispose();
    }

    private void onCancel() {
        dispose();
    }

    public void open() {

        CreatePaddook dialog = new CreatePaddook();
        dialog.pack();
        dialog.setVisible(true);
    }
}
