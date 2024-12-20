/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

/**
 *
 * @author ajay4
 */
public class FeedbackS {
    public String Email,UserName;
    public String Passwrd,rolee;
    
    public FeedbackS(String Email,String UserName,String Passwrd,String rolee){
      this.Email= Email;
      this.UserName=UserName;
      this.Passwrd=Passwrd;
      this.rolee=rolee;
    }
    public String getEmail(){
        return Email;
    } 
    public String getUserName(){
        return UserName;
    }
    public String getPasswrd(){
        return Passwrd;
    }
    public String getRolee(){
        return rolee;
    }
}
