/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esd;

/**
 *
 * @author jnl
 */
public class admin extends User {
    
    private String userType;

    public Customer(String username, String password, String userType)
    {
        super(username, password, userType);

        this.userType = userType;
    }
    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

}
