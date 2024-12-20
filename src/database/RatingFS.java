/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

/**
 *
 * @author ajay4
 */
public class RatingFS {
    public String Email,Language,Rate,Experience,Suggestion;
   
    
    public RatingFS(String Email,String Language,String Rate,String Experience,String Suggestion){
      this.Email= Email;
      this.Language=Language;
      this.Rate= Rate;
      this.Experience=Experience;
      this.Suggestion=Suggestion;
    }
    public String getEmail(){
        return Email;
    }
     
    public String getLanguage(){
        return Language;
    }
    public String getRate(){
        return Rate;
    }
    public String getExperience(){
        return Experience;
    }
    public String getSuggestion(){
        return Suggestion;
    }
    
}
