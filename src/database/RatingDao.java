/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ajay4
 */
public class RatingDao {
    public String insert(RatingFS r){
        String str="insert into Rating1(Email,Language,Rate,Experience,Suggestion) values(?,?,?,?,?)";
        Dbconn db=new Dbconn();
        try{
          Connection con=db.getConnection();
            System.out.println("Connected");
            PreparedStatement psmt=con.prepareStatement(str);
            psmt.setString(1, r.getEmail());
            psmt.setString(2,r.getLanguage());
            psmt.setString(3,r.getRate());
            psmt.setString(4,r.getExperience());
            psmt.setString(5,r.getSuggestion());
            int rno=psmt.executeUpdate();
            return rno+ "record inserted";
        }catch(Exception e){
        e.printStackTrace();
        return e.getMessage();
            
        }}}

    

