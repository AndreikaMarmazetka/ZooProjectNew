package View;

import Model.objects.Lists.Food;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainWindow extends JFrame {
    public JButton searchAnimalButton;
    public JButton createAnimalButton;
    public JPanel panel1;

    public MainWindow() {
        setContentPane(panel1);
        setVisible(true);
        setSize(1000, 600);


        createAnimalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                oncreateAnimalButton();
            }
        });

        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    private void oncreateAnimalButton() {
        CreateAnimal createA = new CreateAnimal();
        createA.open();
    }

    public static void main(String[] args) {
        new MainWindow();
    }


}
