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
import javax.swing.SpringLayout;

/**
 *
 * @author samue
 */
public class homepage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
