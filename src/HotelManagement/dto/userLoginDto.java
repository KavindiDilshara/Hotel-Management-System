/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HotelManagement.dto;

/**
 *
 * @author kavindi
 */
public class userLoginDto {
    
    private String userID;
    private String passWord;

    public userLoginDto() {
    }

    public userLoginDto(String userID, String passWord) {
        this.userID = userID;
        this.passWord = passWord;
    }

    /**
     * @return the userID
     */
    public String getUserID() {
        return userID;
    }

    /**
     * @param userID the userID to set
     */
    public void setUserID(String userID) {
        this.userID = userID;
    }

    /**
     * @return the passWord
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * @param passWord the passWord to set
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "userLoginDto{" + "userID=" + userID + ", passWord=" + passWord + '}';
    }

   
    
}
