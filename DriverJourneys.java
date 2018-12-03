/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author jnl
 */
public class DriverJourneys {
    
    private Date date;
    private Time time;
    private Job job;
   
public DriverJourneys(Job job, Date date, Time time) {
        this.job = job;
        this.date = date;
        this.time = time;
   
}

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }
    
    @Override
    public String toString(){
    return Job.toString() + "Date: " + date + "Time: " + time;
}
}
