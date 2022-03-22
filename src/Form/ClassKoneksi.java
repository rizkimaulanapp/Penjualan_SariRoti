/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author FB
 */
public class ClassKoneksi {
 private static Connection koneksi;  
 public static Connection getkoneksi(){  
    if(koneksi==null){  
      try {  
        String url=new String();  
        String user=new String();  
        String password=new String();  
        url="jdbc:mysql://localhost:3306/db_sariroti";  
        user="root";  
        password="";  
          DriverManager.registerDriver(new com.mysql.jdbc.Driver());  
        koneksi=DriverManager.getConnection(url,user,password);  
      }catch (SQLException t){  
        System.out.println("Eror membuat koneksi");  
      }  
     }  
    return koneksi;  
  }   
}
