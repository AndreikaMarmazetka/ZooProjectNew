package View;

import VeiwModel.CaseUserFunction;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainWindow extends JFrame {
    public JButton searchAnimalButton;
    public JButton createAnimalButton;
    public JPanel panel1;
    public int Button;

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
        CreateAnimal ca = new CreateAnimal();
        ca.open();
       // new CaseUserFunction().setNumberFunction(0);
    }

    public static void loadWindow() {
        new MainWindow();
    }

}
