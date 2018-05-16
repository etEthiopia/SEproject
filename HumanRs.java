package Gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;


public class HumanRs extends JFrame{
    JButton logbut;
    JButton regbut;
    ArrayList<String> mainArray;

    public HumanRs() {
        setTitle("Human Resource Managment");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setLayout(null);
        
        logbut = new JButton("Log in");
        logbut.setBounds(130, 100, 100, 100);
        logbut.addActionListener(new EventHandle());
        
        regbut = new JButton("Registration");
        regbut.setBounds(270, 100, 200, 100);
        
        add(logbut);
        add(regbut);
        
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private class EventHandle implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            JFrame loginWind = new JFrame("LOG IN");
            loginWind.setSize(600, 400);
            loginWind.setLocationRelativeTo(null);
            loginWind.setLayout(null);
            loginWind.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            loginWind. setVisible(true);
        }
    }
}
