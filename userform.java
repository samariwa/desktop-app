/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal.project;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author samue
 */
public class userform {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // setting 'Add User Form' as the title for the JFrame
        JFrame userForm=new JFrame("Add User Form");
        JPanel a=new JPanel();
        //adding a Label that instructs user to fill in details
        JLabel title=new JLabel("ADD NEW USER");
        //adding a Label that shows what is to be indicated in the textfield
        JLabel firstName=new JLabel("First Name:");
        JLabel lastName=new JLabel("Last Name:");
        JLabel telephone=new JLabel("Telephone:");
        JLabel dob=new JLabel("Date of Birth:");
        JLabel gender=new JLabel("Gender:");
        JLabel male=new JLabel("Male:");
        JLabel female=new JLabel("Female:");
        //adding a radiobutton that enables user to select their sex
        JRadioButton e=new JRadioButton();
        JRadioButton f=new JRadioButton();
        JTextField c=new JTextField();
        JTextField d=new JTextField();
        JTextField g=new JTextField();
        JTextField h=new JTextField();
        c.setColumns(20);
        d.setColumns(20);
        g.setColumns(20);
        h.setColumns(20);
        //adding buttons that enable the user clear information input or to login with what is set 
        JButton clear=new JButton("Clear");
        JButton saveUser=new JButton("Save User");
        a.setBackground(Color.WHITE);
        title.setFont(new Font("sanserif",Font.PLAIN,28));
        firstName.setFont(new Font("sanserif",Font.PLAIN,28));
        c.setFont(new Font("sanserif",Font.PLAIN,25));
        lastName.setFont(new Font("sanserif",Font.PLAIN,28));
        d.setFont(new Font("sanserif",Font.PLAIN,25));
        telephone.setFont(new Font("sanserif",Font.PLAIN,28));
        g.setFont(new Font("sanserif",Font.PLAIN,25));
        dob.setFont(new Font("sanserif",Font.PLAIN,28));
        h.setFont(new Font("sanserif",Font.PLAIN,25));
        gender.setFont(new Font("sanserif",Font.PLAIN,28));
        male.setFont(new Font("sanserif",Font.PLAIN,28));      
        female.setFont(new Font("sanserif",Font.PLAIN,28));
        clear.setFont(new Font("sanserif",Font.PLAIN,28));
        saveUser.setFont(new Font("sanserif",Font.PLAIN,28));
        a.setLayout(null);
        //adding the JPanel components that have been imported
        a.add(title);
        a.add(firstName);
        a.add(c);
        a.add(lastName);
        a.add(d);
        a.add(telephone);
        a.add(g);
        a.add(dob);
        a.add(h);
        a.add(gender);
        a.add(male);
        a.add(e);
        a.add(female);
        a.add(f);
        a.add(clear);
        a.add(saveUser);
        userForm.add(a);
         //layout for the JPanel
        title.setBounds(800,60,400,40);
        firstName.setBounds(400,200,350,25);
        c.setBounds(550,200,1000,40);
        lastName.setBounds(400,300,350,25);
        d.setBounds(550,300,1000,40);
        telephone.setBounds(400,400,350,30);
        g.setBounds(550,400,1000,40);
        dob.setBounds(400,500,350,25);
        h.setBounds(570,500,980,40);
        gender.setBounds(400,600,350,25);
        male.setBounds(730,600,200,25);
        e.setBounds(800,600,30,30);
        female.setBounds(1050,600,200,25);
        f.setBounds(1150,600,30,30);
        clear.setBounds(700,800,200,50);
        saveUser.setBounds(1200,800,200,50);
        //setting the size of the JFrame
        userForm.setSize(2000,1300);
        //setting how the gui will be closed by the user
        userForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        userForm.setVisible(true);
        
    }
    
}
