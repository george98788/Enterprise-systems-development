/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author jnl
 */
public class Destination {
   
    private List<driveryJourneys> DestinationA = new ArrayList<>();
    private List<driverJourneys> DestinationB = new ArrayList<>();

public Destination(driverJourneys Destination A, driverJourneys DestinationB){
        this.DestinationA = DestinationA;
        this.DestinationB = DestinationB;
}
    public driverJourneys getDestinationA() {
        return DestinationA;
    }

    public void setDestinationA(driverJourneys DestinationA) {
        this.DestinationA = DestinationA;
    }

    public driverJourneys getDestinationB() {
        return DestinationB;
    }

    public void setDestinationB(driverJourneys DestinationB) {
        this.DestinationB = DestinationB;
    }

