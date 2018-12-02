/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.io.Serializable;
import java.util.Collection;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author saphi
 */
@Entity
@Table(name = "DRIVERS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Drivers.findAll", query = "SELECT d FROM Drivers d")
    , @NamedQuery(name = "Drivers.findById", query = "SELECT d FROM Drivers d WHERE d.id = :id")
    , @NamedQuery(name = "Drivers.findByName", query = "SELECT d FROM Drivers d WHERE d.name = :name")
    , @NamedQuery(name = "Drivers.findByRegistration", query = "SELECT d FROM Drivers d WHERE d.registration = :registration")})
public class Drivers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "NAME")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "REGISTRATION")
    private String registration;
    @OneToMany(mappedBy = "driversId")
    private Collection<Journeys> journeysCollection;
    @JoinColumn(name = "USERS_ID", referencedColumnName = "ID")
    @ManyToOne
    private Users usersId;

    public Drivers() {
    }

    public Drivers(Integer id) {
        this.id = id;
    }

    public Drivers(Integer id, String name, String registration) {
        this.id = id;
        this.name = name;
        this.registration = registration;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    @XmlTransient
    public Collection<Journeys> getJourneysCollection() {
        return journeysCollection;
    }

    public void setJourneysCollection(Collection<Journeys> journeysCollection) {
        this.journeysCollection = journeysCollection;
    }

    public Users getUsersId() {
        return usersId;
    }

    public void setUsersId(Users usersId) {
        this.usersId = usersId;
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
        if (!(object instanceof Drivers)) {
            return false;
        }
        Drivers other = (Drivers) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "web.Drivers[ id=" + id + " ]";
    }
    
}
