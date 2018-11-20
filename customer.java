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
public class customer extends User {
    

    private String address;
    private String telephone;

    public Customer(String username, String password, String address, String telephone)
    {
        super(username, password, address, telephone);

        this.address = address;
        this.telephone = telephone;
    }

    public String getTelephone()
    {
        return telephone;
    }

    public void setTelephone(String telephone)
    {
        this.telephone = telephone;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

 
    
}
