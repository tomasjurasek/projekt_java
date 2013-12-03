/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author silent
 */
public  class DatabaseConnect {
    
//    private final String url = "jdbc:derby://localhost:1527/APP;create=true";
//    private final String user = "app";
//    private final String password = "root";
     private  String driver = "org.apache.derby.jdbc.ClientDriver"; 
     private  Connection con = null;
     private  Statement stmn = null;
     public   boolean Connect(){
        boolean isConnect = false;
        try{
             Class.forName(driver).newInstance(); 
             con = DriverManager.getConnection("jdbc:derby://localhost:1527/test","root","root");
             
            
//            String name  = "lucas";
//            int phone = 3242;
            
            //String insert = "INSERT INTO ZKOUSKA VALUE('"+name+"', "+phone+")";
           //  stmn.executeUpdate("INSERT INTO APP.zkouska VALUE('asdasd',2)");
             
            
             isConnect = true;
        }
        catch(Exception ex){
            
        }
        return isConnect;
    }
     
     public  void InsertQuery(String query){
         try{
            stmn =  con.createStatement();
         
            stmn.executeUpdate("INSERT INTO APP.zkouska"
                + " (name, phone)"
                + " VALUES ('TOMAS', 12)");
         
         }catch(Exception ex){}
         
     }
    
    
    public  void DisConnect()
    {
        try{
            con.close();
        }catch(Exception ex){}
        
        
    }
    
}
