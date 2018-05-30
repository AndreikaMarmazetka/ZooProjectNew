package View;

import VeiwModel.CaseUserFunction;
import VeiwModel.Sevices.user.SearchService;

import javax.swing.*;
import java.awt.event.*;

public class SearchAnimal extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField textFieldSearchType;
    private JTextField textFieldSearchMinimalCost;
    private JTextField textFieldSearchMaximalCost;
    private JComboBox comboBoxSearchEnviroment;
    private JComboBox comboBoxSearchPaddook;
    private JComboBox comboBoxSearchStatusWay;
    private JComboBox comboBoxSearchFood;

    public SearchAnimal() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        setSize(300, 400);

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

        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {
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
