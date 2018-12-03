/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author saphi
 */
@Entity
@Table(name = "JOURNEYS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Journeys.findAll", query = "SELECT j FROM Journeys j")
    , @NamedQuery(name = "Journeys.findById", query = "SELECT j FROM Journeys j WHERE j.id = :id")
    , @NamedQuery(name = "Journeys.findByDestination", query = "SELECT j FROM Journeys j WHERE j.destination = :destination")
    , @NamedQuery(name = "Journeys.findByDistance", query = "SELECT j FROM Journeys j WHERE j.distance = :distance")
    , @NamedQuery(name = "Journeys.findByJourneyDate", query = "SELECT j FROM Journeys j WHERE j.journeyDate = :journeyDate")
    , @NamedQuery(name = "Journeys.findByJourneyTime", query = "SELECT j FROM Journeys j WHERE j.journeyTime = :journeyTime")})
public class Journeys implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "DESTINATION")
    private String destination;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DISTANCE")
    private int distance;
    @Basic(optional = false)
    @NotNull
    @Column(name = "JOURNEY_DATE")
    @Temporal(TemporalType.DATE)
    private Date journeyDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "JOURNEY_TIME")
    @Temporal(TemporalType.TIME)
    private Date journeyTime;
    @JoinColumn(name = "DRIVERS_ID", referencedColumnName = "ID")
    @ManyToOne
    private Drivers driversId;

    public Journeys() {
    }

    public Journeys(Integer id) {
        this.id = id;
    }

    public Journeys(Integer id, String destination, int distance, Date journeyDate, Date journeyTime) {
        this.id = id;
        this.destination = destination;
        this.distance = distance;
        this.journeyDate = journeyDate;
        this.journeyTime = journeyTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public Date getJourneyDate() {
        return journeyDate;
    }

    public void setJourneyDate(Date journeyDate) {
        this.journeyDate = journeyDate;
    }

    public Date getJourneyTime() {
        return journeyTime;
    }

    public void setJourneyTime(Date journeyTime) {
        this.journeyTime = journeyTime;
    }

    public Drivers getDriversId() {
        return driversId;
    }

    public void setDriversId(Drivers driversId) {
        this.driversId = driversId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Journeys)) {
            return false;
        }
        Journeys other = (Journeys) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "web.Journeys[ id=" + id + " ]";
    }
    
}
