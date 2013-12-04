/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import org.apache.derby.client.am.DateTime;

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
     private ResultSet rs = null;
     public   boolean Connect(){
        boolean isConnect = false;
        try{
             Class.forName(driver).newInstance(); 
             con = DriverManager.getConnection("jdbc:derby://localhost:1527/test","root","root");
             //con.prepareStatement(driver);
            
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
     public ResultSet SelectQuery(String sql){
         
         try{
           stmn = con.createStatement();
           rs = stmn.executeQuery(sql);
         }catch(Exception ex){}
         
         return  rs;
     }
     public  void InsertQuery(String CisloFaktury,String Jmeno,String Adresa, String Mesto, String PSC, String Vystaveni,String Splatnost){
         try{
            stmn =  con.createStatement();
            stmn.executeUpdate("delete from APP.FAKTURY where cislo_faktury=" +Integer.parseInt(CisloFaktury));
            stmn.executeUpdate("INSERT INTO APP.FAKTURY"
                + " (CISLO_FAKTURY, JMENO,MESTO,ADRESA,PSC,VYSTAVENI,SPLATNOST)"
                + " VALUES ("+ Integer.parseInt(CisloFaktury)+",'"+Jmeno+"','" + Adresa+"', '"+ Mesto +"','"+PSC+"','"+Vystaveni+"','"+Splatnost+"' )");
         
         }catch(Exception ex){}
         
     }
    
    
    public  void DisConnect()
    {
        try{
            con.close();
        }catch(Exception ex){}
        
        
    }
    
}
