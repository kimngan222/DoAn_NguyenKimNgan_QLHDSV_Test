/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author dell
 */
public class userDTO {
    private String user;
    private String pass;
    
    public void setUser(String user){
        this.user = user;
    }
    public void setPass(String pass){
        this.pass = pass;
    }


    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }
}
