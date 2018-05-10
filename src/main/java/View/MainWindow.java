package View;

import javax.swing.*;


public class MainWindow extends JFrame {
    public MainWindow() {
        super("MainWindow");
        this.setContentPane(panel1);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        panel1.show();
    }


    private JTable viewQuere;
    private JPanel panel1;
    private JButton searchButton;
    private JButton createAnimalButton;
    private JButton createPaddookButton;

}
