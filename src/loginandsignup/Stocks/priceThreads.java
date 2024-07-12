
package loginandsignup.Stocks;

//getting prices of the stocks using threads 



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class priceThreads {
    
    public static void main(String[] args){
        String SUrl="",SUser="",SPass=" ";
        SUrl = "jdbc:MySQL://localhost:3308/java_users_database";
        SUser = "root";
        SPass = "";
   try{
        
        Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
        Statement st = con.createStatement();
        
    }
   
    catch(Exception e){
        
    }
   System.out.print(SUrl);
    }
}
