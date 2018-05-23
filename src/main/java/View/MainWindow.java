package View;

import javax.swing.*;

public class MainWindow extends JFrame{
    public JButton searchAnimalButton;
    public JButton createAnimalButton;
    public JPanel panel1;

    public MainWindow(){
        setContentPane(panel1);
        setVisible(true);
        setSize(1000,600);
    }

    public static void main(String[] args) {
        new MainWindow();
    }
}
