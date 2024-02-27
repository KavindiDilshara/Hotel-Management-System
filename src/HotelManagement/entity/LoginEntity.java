/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HotelManagement.entity;

/**
 *
 * @author kavindi
 */
public class LoginEntity {
   
    private String userId;
    private String pw;

    public LoginEntity() {
    }

    public LoginEntity(String userId, String pw) {
        this.userId = userId;
        this.pw = pw;
    }

    /**
     * @return the userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @return the pw
     */
    public String getPw() {
        return pw;
    }

    /**
     * @param pw the pw to set
     */
    public void setPw(String pw) {
        this.pw = pw;
    }

    @Override
    public String toString() {
        return "LoginEntity{" + "userId=" + userId + ", pw=" + pw + '}';
    }
    
    
    
}
