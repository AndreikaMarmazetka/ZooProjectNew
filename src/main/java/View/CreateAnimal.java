package View;

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
        comboBoxType.getSelectedIndex();
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public static void open() {
        CreateAnimal dialog = new CreateAnimal();
        dialog.pack();
        dialog.setVisible(true);
        // System.exit(0);
    }


}
