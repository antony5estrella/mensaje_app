
package com.ladd.mensaje_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 5estrella
 */
public class Conexion {
    
  public Connection get_connection() {
  
      Connection connection = null;
      try{
          connection = DriverManager.getConnection
        ("jdbc:mysql://localhost:3306/mensaje_app","root","");
          
          }catch(SQLException e){
         System.out.println(e);
      }
      return connection;
  }
    
}
