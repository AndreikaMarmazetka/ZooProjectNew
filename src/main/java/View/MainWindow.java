package View;

import Model.ZooApplication;
import Model.create.objects.AnimalBox;
import Model.objects.Animal;
import VeiwModel.CaseGetAnimal;
import VeiwModel.CaseUserFunction;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainWindow extends JFrame {
    public JButton searchAnimalButton;
    public JButton createAnimalButton;
    public JPanel panel1;
    public JPanel panelAnimal;
    public int Button;



    public MainWindow() {
        setContentPane(panel1);
        setVisible(true);
        setSize(1000, 600);
        addAnimal(AnimalBox.getInstance().getListAnimal(0));


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
        new CreateAnimal().open();
    }

    public static void main(String[] args) {
        ZooApplication.LoadModel();
        new MainWindow();
    }

    public void addAnimal(Animal animal){
        panelAnimal.setLayout(null);
        for(int i=0; i<=11;i++) {
            JLabel l = new JLabel();
            l.setBounds(5+80*i, 5, 80, 30);
            l.setText(new CaseGetAnimal().getAnimalInfo(i, animal));
            panelAnimal.add(l);
        }
        revalidate();
        repaint();
    }
}
