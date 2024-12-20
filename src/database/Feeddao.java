/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;
import java.sql.*;
import java.util.*;
/**
 *
 * @author ajay4
 */
public class Feeddao {
    public String insert(FeedbackS f){
        String sqlStr="insert into Login(Email,UserName,Passwrd,rolee) values(?,?,?,?)";
        Dbconn db=new Dbconn();
        try{
           Connection con= db.getConnection();
           System.out.println("connected"); 
           PreparedStatement psmt=con.prepareStatement(sqlStr);//user se runtime mai query ki values ko lene k liye we use PreparedStatement
           psmt.setString(1,f.getEmail());
           psmt.setString(2, f.getUserName());
           psmt.setString(3,f.getPasswrd());
           psmt.setString(4, f.getRolee());
           int rno=psmt.executeUpdate();
           return rno+" record inserted";

        }
        catch(Exception e){
        e.printStackTrace();
        return e.getMessage();
    
     }
    
    }
    }  


