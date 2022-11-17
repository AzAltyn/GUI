package click_me;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener {
    private int click = 0;
    private JLabel lbl = new JLabel("Number of clicks: 0");
    private JFrame frame = new JFrame();

    public GUI(){
        JButton btn = new JButton("Click Me");
        btn.addActionListener(this);

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(btn);
        panel.add(lbl);

        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(3);
        frame.setTitle("GUI");
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        click++;
        lbl.setText("Number os clicks: " + click);
    }

    public static void main(String[] args){
        new GUI();
    }
}
