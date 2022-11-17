package task7_2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame{
    JButton btnAdd;
    JButton btnList;
    JButton btnExit;
    JButton btnBack;
    JButton btnAddin;
    JLabel lblName;
    JLabel lblSurname;
    JLabel lblFaculty;
    JLabel lblGroup;
    JLabel lblList;
    JTextField txtfName;
    JTextField txtfSurname;
    JTextField txtfgroup;
    JComboBox comboBoxFaculty;
    private String[] facultyes = new String[5];
    public Menu(){
        {
            facultyes[0] = new String("Information Technologies");
            facultyes[1] = new String("Economics");
            facultyes[2] = new String("Mathematics");
            facultyes[3] = new String("Physics");
            facultyes[4] = new String("History");
        }
        Menu menu = new Menu();
        menu.setVisible(true);

        setDefaultCloseOperation(3);
        setTitle("STUDENT APPLICATION");
        setSize(700,600);
        setLayout(null);

        btnAdd = new JButton("ADD STUDENTS");
        btnAdd.setSize(200,30);
        btnAdd.setLocation(250,150);
        add(btnAdd);

        btnList = new JButton("LIST STUDENTS");
        btnList.setSize(200,30);
        btnList.setLocation(250,200);
        add(btnList);

        btnExit = new JButton("EXIT");
        btnExit.setSize(200,30);
        btnExit.setLocation(250,250);
        add(btnExit);

        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu addStudent = new Menu();
                addStudent.setVisible(true);
            }
        });
    }
    public void addStudent(){

    }

}
