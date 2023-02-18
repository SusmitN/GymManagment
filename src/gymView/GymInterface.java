/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymView;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedHashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author susmi
 */
public interface GymInterface {
    //objects
    public LoginPage loginPage = new LoginPage();
    public HomePage homePage=new HomePage();
    public NewMemberPage newMemberPage=new NewMemberPage();
    public UpdateAndDeletePage updateAndDeletePage=new UpdateAndDeletePage();
    public ListPage listPage=new ListPage();
    public PaymentPage paymentPage=new PaymentPage();

    
    //database Connectivity
    public Connection con= getDBConnection();

    public static Connection getDBConnection()
    {
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/gymmanagmentsystem", "root", "");
            return connect;
        }catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, e, "Connectivity Issue", JOptionPane.ERROR_MESSAGE);
    }
        return null;
}
    
   
   
    
    
}