/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal.project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author samue
 */
public class Gui {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // adding a GUI frame with a title 'login' on it
        JFrame loginpage=new JFrame("Login");
        JPanel a=new JPanel();
        //adding a Label that shows what is to be indicated in the textfield
        JLabel name=new JLabel("Username:");
        JLabel password=new JLabel("Password:");
        JTextField c=new JTextField();
        JPasswordField d=new JPasswordField();
        c.setColumns(20);
        d.setColumns(20);
        //adding buttons that enable the user clear information input or to login with what is set 
        JButton clear=new JButton("Clear");
        JButton login=new JButton("Login");
        a.setBackground(Color.WHITE);
        name.setFont(new Font("sanserif",Font.PLAIN,28));
        password.setFont(new Font("sanserif",Font.PLAIN,28));
        clear.setFont(new Font("sanserif",Font.PLAIN,28));
        login.setFont(new Font("sanserif",Font.PLAIN,28));      
        a.setLayout(null);
        //adding the JPanel components that have been imported
        a.add(name);
        a.add(c);
        a.add(password);
        a.add(d);
        a.add(clear);
        a.add(login);
        loginpage.add(a);
        //layout setup
        name.setBounds(700,250,150,25);
        c.setBounds(850,250,400,40);
        password.setBounds(700,400,150,25);
        d.setBounds(850,400,400,40);
        clear.setBounds(750,800,150,50);
        login.setBounds(1100,800,150,50);
        //setting the size of the JFrame
        loginpage.setSize(2000,1300);
        //setting how the gui will be closed by the user
        loginpage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginpage.setVisible(true);
        
        
    }
    
}
