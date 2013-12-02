/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author silent
 */
@Entity
@Table(name = "FAKTURY", catalog = "", schema = "APP")
@NamedQueries({
    @NamedQuery(name = "Faktury.findAll", query = "SELECT f FROM Faktury f"),
    @NamedQuery(name = "Faktury.findByCisloFaktury", query = "SELECT f FROM Faktury f WHERE f.cisloFaktury = :cisloFaktury"),
    @NamedQuery(name = "Faktury.findByJmeno", query = "SELECT f FROM Faktury f WHERE f.jmeno = :jmeno"),
    @NamedQuery(name = "Faktury.findByMesto", query = "SELECT f FROM Faktury f WHERE f.mesto = :mesto"),
    @NamedQuery(name = "Faktury.findByAdresa", query = "SELECT f FROM Faktury f WHERE f.adresa = :adresa"),
    @NamedQuery(name = "Faktury.findByPsc", query = "SELECT f FROM Faktury f WHERE f.psc = :psc"),
    @NamedQuery(name = "Faktury.findByVystaveni", query = "SELECT f FROM Faktury f WHERE f.vystaveni = :vystaveni"),
    @NamedQuery(name = "Faktury.findBySplatnost", query = "SELECT f FROM Faktury f WHERE f.splatnost = :splatnost")})
public class Faktury implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CISLO_FAKTURY")
    private Long cisloFaktury;
    @Column(name = "JMENO")
    private String jmeno;
    @Column(name = "MESTO")
    private String mesto;
    @Column(name = "ADRESA")
    private String adresa;
    @Column(name = "PSC")
    private String psc;
    @Column(name = "VYSTAVENI")
    @Temporal(TemporalType.DATE)
    private Date vystaveni;
    @Column(name = "SPLATNOST")
    @Temporal(TemporalType.DATE)
    private Date splatnost;

    public Faktury() {
    }

    public Faktury(Long cisloFaktury) {
        this.cisloFaktury = cisloFaktury;
    }

    public Long getCisloFaktury() {
        return cisloFaktury;
    }

    public void setCisloFaktury(Long cisloFaktury) {
        Long oldCisloFaktury = this.cisloFaktury;
        this.cisloFaktury = cisloFaktury;
        changeSupport.firePropertyChange("cisloFaktury", oldCisloFaktury, cisloFaktury);
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        String oldJmeno = this.jmeno;
        this.jmeno = jmeno;
        changeSupport.firePropertyChange("jmeno", oldJmeno, jmeno);
    }

    public String getMesto() {
        return mesto;
    }

    public void setMesto(String mesto) {
        String oldMesto = this.mesto;
        this.mesto = mesto;
        changeSupport.firePropertyChange("mesto", oldMesto, mesto);
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        String oldAdresa = this.adresa;
        this.adresa = adresa;
        changeSupport.firePropertyChange("adresa", oldAdresa, adresa);
    }

    public String getPsc() {
        return psc;
    }

    public void setPsc(String psc) {
        String oldPsc = this.psc;
        this.psc = psc;
        changeSupport.firePropertyChange("psc", oldPsc, psc);
    }

    public Date getVystaveni() {
        return vystaveni;
    }

    public void setVystaveni(Date vystaveni) {
        Date oldVystaveni = this.vystaveni;
        this.vystaveni = vystaveni;
        changeSupport.firePropertyChange("vystaveni", oldVystaveni, vystaveni);
    }

    public Date getSplatnost() {
        return splatnost;
    }

    public void setSplatnost(Date splatnost) {
        Date oldSplatnost = this.splatnost;
        this.splatnost = splatnost;
        changeSupport.firePropertyChange("splatnost", oldSplatnost, splatnost);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cisloFaktury != null ? cisloFaktury.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Faktury)) {
            return false;
        }
        Faktury other = (Faktury) object;
        if ((this.cisloFaktury == null && other.cisloFaktury != null) || (this.cisloFaktury != null && !this.cisloFaktury.equals(other.cisloFaktury))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "projekt.Faktury[ cisloFaktury=" + cisloFaktury + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
