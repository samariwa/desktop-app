/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author samue
 */
public class Database {
    private Connection con;
    private Statement st;
    private ResultSet r;
    
    public Database(){
                    try{
                        //getting drivers for the database
    Class.forName("com.mysql.cj.jdbc.Driver");
    //connection to the database
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/receptionapp","root","samokoth.1999");
    st=con.createStatement();
}catch (Exception a)
{
    //output when there is an error in connection
    System.out.println("Error: "+a);
}
    }
    public void getData()
    {
        try{
            //adding query for the database
            String query="select*from users";
            r=st.executeQuery(query);
            //output once the query has been made
            System.out.println("Information in the Database.");
            while(r.next())
            {
                //declaration of information in the database
                String First_name=r.getString("First_name");
                String Last_name=r.getString("Last_name");
                int Telephone=r.getInt("Telephone");
                String Date_of_birth=r.getString("Date_of_Birth");
                String Gender=r.getString("Gender");
                //output of the information in the database
                System.out.print("First_name:"+First_name);
                System.out.print("\nLast_name:"+Last_name);
                System.out.print("\nTelephone:"+Telephone);
                System.out.print("\nDate_of_Birth:"+Date_of_birth);
                System.out.print("\nGender:"+Gender);     
            }
            
        }catch(Exception a)
        {
            System.out.print("a");
        }
        
    }
}

    
