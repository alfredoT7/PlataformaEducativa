
package BDfx;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Conection {
    
    Connection conn=null;
    String url="jdbc:postgresql://localhost:5433/plataformaEDU";
    String usuario="stuart";
    String clave="1234";
    
    public Connection conectar(){
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, usuario, clave);
            JOptionPane.showMessageDialog(null,"Conexion Exitosa");
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error al conectar"+e);
            
        } 
        return conn;
    }
     
     public void desconectar() {
        try {
            conn.close();
        } catch (Exception ex) {
        }
    }   
    
}
