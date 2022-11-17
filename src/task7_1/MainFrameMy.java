package task7_1;

import javax.swing.*;

public class MainFrame extends JFrame {
    private Integer[] ages = new Integer[100];
    private JLabel lbl1;
    private JLabel lbl2;
    private JLabel lbl3;
    private JTextField txtField1;
    private JTextField txtField2;
    private JComboBox comboBox;
    private JButton btn;
    private JTextArea area;

    public MainFrame(){
        for (int i=0; i<100; i++){
            ages[i] = i;
        }

        setSize(500,800);
        setTitle("BITLAB Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(null);

        lbl1 = new JLabel("Name: ");
        lbl1.setSize(100,30);
        lbl1.setLocation(100,100);
        add(lbl1);
        lbl2 = new JLabel("Phone: ");
        lbl2.setSize(100,30);
        lbl2.setLocation(100,140);
        add(lbl2);
        lbl3 = new JLabel("Age: ");
        lbl3.setSize(100,30);
        lbl3.setLocation(100,180);
        add(lbl3);


    }
}
