/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal.project;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

/**
 *
 * @author samue
 */
public class testing {

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
        c.setFont(new Font("sanserif",Font.PLAIN,25));
        password.setFont(new Font("sanserif",Font.PLAIN,28));
        d.setFont(new Font("sanserif",Font.PLAIN,25));
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
        //adding actionlistener for login
        login.addActionListener(new Action());
        //adding jpanel to jframe
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
    static class Action implements ActionListener
    {
        public void actionPerformed(ActionEvent z)
        {
         // setting 'home' as the title for the JFrame
        JFrame homePage=new JFrame("Home");
        JPanel a=new JPanel();
        //adding a Label that shows what each chart below it is representing
        JLabel pieChart=new JLabel("Chart showing Gender Distribution");
        JLabel columnChart=new JLabel("Column Chart Showing Age Distribution");
       
        JButton addUser=new JButton("Add User");
        JButton logout=new JButton("Logout");
        a.setBackground(Color.WHITE);
        pieChart.setFont(new Font("sanserif",Font.PLAIN,28));
        columnChart.setFont(new Font("sanserif",Font.PLAIN,28));
        addUser.setFont(new Font("sanserif",Font.PLAIN,28));
        logout.setFont(new Font("sanserif",Font.PLAIN,28));
        a.setLayout(null);
        //adding the JPanel components that have been imported
        a.add(pieChart);
        a.add(columnChart);
        a.add(addUser);
        a.add(logout);
        homePage.add(a);
        //adding actionlistener for add user button
        addUser.addActionListener(new Act());
        //adding actionlistener fo logout button
        logout.addActionListener(new ActDone());
        //layout setup
        pieChart.setBounds(200,40,500,35);
        columnChart.setBounds(1200,40,500,35);
        addUser.setBounds(500,900,250,45);
        logout.setBounds(1200,900,250,45);
        //setting the size of the JFrame
        homePage.setSize(2000,1300);
        //setting how the gui will be closed by the user
        homePage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        homePage.setVisible(true);  
        }       
    }
    static class Act implements ActionListener
    {
     public void actionPerformed(ActionEvent y)
     {
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
    static class ActDone implements ActionListener
    {
         public void actionPerformed(ActionEvent x)
         {
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
        c.setFont(new Font("sanserif",Font.PLAIN,25));
        password.setFont(new Font("sanserif",Font.PLAIN,28));
        d.setFont(new Font("sanserif",Font.PLAIN,25));
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
        //adding actionlistener for login
        login.addActionListener(new Action());
        //adding jpanel to jframe
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
}

   


        

