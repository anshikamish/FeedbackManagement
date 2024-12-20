/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.*;


/**
 *
 * @author ajay4
 */
public class Dbconn {
      
       
 public Connection getConnection()throws Exception{
       Class.forName( "com.mysql.cj.jdbc.Driver");//driver ko memory mai load krna jo ki Class.forName krega
       Connection con=DriverManager.getConnection(
               "jdbc:mysql://localhost:3306/fsystem","root","root");//
       System.out.println("database connected");
       return con;
    }
    }

   

