/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 *
 * @author markel
 * @author moroni
 */
public class ModelImplementation implements Model{
    /**
     * Aqui se coge el saludo del fichero
     * @param greeting 
     */
    private Connection con;
        private Statement stmt;
        private ResourceBundle rb = ResourceBundle.getBundle("almacen.config");
        
        //Método que nos conecta con la BD
        public void openConnection() throws ClassNotFoundException, SQLException{
            
          try {
            Class.forName("com.mysql.jdbc.Driver");
            Properties connectionProps = new Properties();
            connectionProps.put("user", rb.getString("DBUser"));
            connectionProps.put("password", rb.getString("DBPass"));
            this.con = DriverManager.getConnection(rb.getString("Conn"), connectionProps);
            
        } catch (SQLException | ClassNotFoundException ex) {
              System.out.println("ERROR para conectar con la BD");
        }
          
        }
        
        //Método que nos desconecta con la BD
        public void closeConnection() throws SQLException{
            con.close();
        }
    @Override
    public String getGreeting(){
  String sal="";
       try {
                openConnection();
                stmt = con.createStatement();
                
                String query = "SELECT * FROM saludo";
                ResultSet rs = stmt.executeQuery(query);
                if(rs.next()){
                    sal=rs.getString("holamundomvc");
                   rs.close();
                   closeConnection();
                }
            } catch (ClassNotFoundException | SQLException ex) {
                 System.out.println("ERROR");
            }
       return sal;
    } 
    
}
 