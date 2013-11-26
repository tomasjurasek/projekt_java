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
    private final String url = "jdbc:mysql://localhost:3306/test";
    private final String user = "root";
    private final String password = "root";
    
    public  boolean Connect(){
        try{
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmn =  con.createStatement();
            
            //String name  = "lucas";
            //int phone = 3242;
            
            //String insert = "INSERT INTO zkouska VALUE('"+name+"', "+phone+")";
             //stmn.executeUpdate(insert);
        }
        catch(Exception ex){
            
        }
        return isConnect;
    }
    
}
