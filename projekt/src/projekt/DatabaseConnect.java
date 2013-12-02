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
    private boolean isConnect = false;
//    private final String url = "jdbc:derby://localhost:1527/APP;create=true";
//    private final String user = "app";
//    private final String password = "root";
     private String driver = "org.apache.derby.jdbc.ClientDriver"; 
    public  boolean Connect(){
        try{
            Class.forName(driver).newInstance(); 
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/test","root","root");
            Statement stmn =  con.createStatement();
            
//            String name  = "lucas";
//            int phone = 3242;
            
            //String insert = "INSERT INTO ZKOUSKA VALUE('"+name+"', "+phone+")";
           //  stmn.executeUpdate("INSERT INTO APP.zkouska VALUE('asdasd',2)");
             
             stmn.executeUpdate("INSERT INTO APP.zkouska"
        + " (name, phone)"
        + " VALUES ('tomas', 23)");
             isConnect = true;
        }
        catch(Exception ex){
            
        }
        return isConnect;
    }
    
}
