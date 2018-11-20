/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jnl
 */
public class driver extends User {


    private String firstName;
    private String lastName;
    private String number;
    private String carPlate;

    public Customer(String username, String password, String firstName, String lastName, String number, String carPlate)
    {
        super(username, password, firstName, lastName, number, carPlate);

        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
        this.carPlate = carPlate;
    }

    public String getfirstName()
    {
        return firstName;
    }

    public void setfirstName(String telephone)
    {
        this.firstName = firstName;
    }

    public String getlastName()
    {
        return lastName;
    }

    public void setlastName(String address)
    {
        this.lastName = lastName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCarPlate() {
        return carPlate;
    }

    public void setCarPlate(String carPlate) {
        this.carPlate = carPlate;
    }
}

