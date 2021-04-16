package main;

import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.event.*;

public class Main extends JFrame{
    private JFrame frame;
    public JFrame dashboard(){
        frame=new JFrame("Testing frame");

        //Where the GUI is created:
        JMenuBar menuBar;
        JMenu menu;
        JMenuItem menuItem;

        //Create the menu bar.
        menuBar = new JMenuBar();

        //Build the first menu.
        menu = new JMenu("Signup");
        menu.setMnemonic(KeyEvent.VK_R);
        menuBar.add(menu);
       
        //Build second menu in the menu bar.
        menu = new JMenu("Signin");
        menu.setMnemonic(KeyEvent.VK_G);
        menuBar.add(menu);

        //Build second menu in the menu bar.
       

        //Build third menu in the menu bar.
     
        //Build fourth menu in the menu bar.
     
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(500,200);

        frame.setJMenuBar(menuBar);

        frame.setVisible(true);

        return frame;
    }

    public static void main(String[] args) {

        new Main().dashboard();
    }
}