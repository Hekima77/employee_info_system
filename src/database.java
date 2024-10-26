
import java.sql.*;   //This part connects  the database  to the GUI
import javax.swing.JOptionPane;

public class database {

    public static Connection getCon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeeinfo?","root",null);
            return con;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
          
        }
        return null;
    }
    
}