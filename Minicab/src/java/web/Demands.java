/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.io.Serializable;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author saphi
 */
@Entity
@Table(name = "DEMANDS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Demands.findAll", query = "SELECT d FROM Demands d")
    , @NamedQuery(name = "Demands.findById", query = "SELECT d FROM Demands d WHERE d.id = :id")
    , @NamedQuery(name = "Demands.findByCustomerName", query = "SELECT d FROM Demands d WHERE d.customerName = :customerName")
    , @NamedQuery(name = "Demands.findByAddress", query = "SELECT d FROM Demands d WHERE d.address = :address")
    , @NamedQuery(name = "Demands.findByDestination", query = "SELECT d FROM Demands d WHERE d.destination = :destination")
    , @NamedQuery(name = "Demands.findByDemandsDate", query = "SELECT d FROM Demands d WHERE d.demandsDate = :demandsDate")
    , @NamedQuery(name = "Demands.findByDemandsTime", query = "SELECT d FROM Demands d WHERE d.demandsTime = :demandsTime")
    , @NamedQuery(name = "Demands.findByStatus", query = "SELECT d FROM Demands d WHERE d.status = :status")})
public class Demands implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "CUSTOMER_NAME")
    private String customerName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "ADDRESS")
    private String address;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "DESTINATION")
    private String destination;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "DEMANDS_DATE")
    private String demandsDate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "DEMANDS_TIME")
    private String demandsTime;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "STATUS")
    private String status;
    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "ID")
    @ManyToOne
    private Customers customerId;

    public Demands() {
    }

    public Demands(Integer id) {
        this.id = id;
    }

    public Demands(Integer id, String customerName, String address, String destination, String demandsDate, String demandsTime, String status) {
        this.id = id;
        this.customerName = customerName;
        this.address = address;
        this.destination = destination;
        this.demandsDate = demandsDate;
        this.demandsTime = demandsTime;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDemandsDate() {
        return demandsDate;
    }

    public void setDemandsDate(String demandsDate) {
        this.demandsDate = demandsDate;
    }

    public String getDemandsTime() {
        return demandsTime;
    }

    public void setDemandsTime(String demandsTime) {
        this.demandsTime = demandsTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Customers getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customers customerId) {
        this.customerId = customerId;
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
        if (!(object instanceof Demands)) {
            return false;
        }
        Demands other = (Demands) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "web.Demands[ id=" + id + " ]";
    }
    
}
