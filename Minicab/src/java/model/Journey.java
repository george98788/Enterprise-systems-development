/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author georg
 */
public class Journey {

    String pickUpPoint;
    String destination;
    String distance;
    String cost;
    String time;
    String date;


    public Journey(String pickUpPoint, String destination, String time, String date) {
        this.pickUpPoint = pickUpPoint;
        this.destination = destination;
        this.time = time;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Journey{" + "pickUpPoint=" + pickUpPoint + ", destination=" + destination + ", distance=" + distance + ", cost=" + cost + ", time=" + time + ", date=" + date + '}';
    }

    public String getPickUpPoint() {
        return pickUpPoint;
    }

    public void setPickUpPoint(String pickUpPoint) {
        this.pickUpPoint = pickUpPoint;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
