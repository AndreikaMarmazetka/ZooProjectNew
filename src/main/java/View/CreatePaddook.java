package View;

import javax.swing.*;
import java.awt.event.*;

public class CreatePaddook extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JCheckBox dangerousCheckBox;
    private JTextField textEditType;
    private JComboBox comboBoxFood;

    public CreatePaddook() {
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
        // add your code here
        dispose();
    }

    private void onCancel() {
        dispose();
    }

    public static void open() {
        CreatePaddook dialog = new CreatePaddook();
        dialog.pack();
        dialog.setVisible(true);
    }
}
