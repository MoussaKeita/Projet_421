/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jeux_421.bean;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
 * @author PC MAROC
 */
@Entity
@Table(name = "partie")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Partie_1.findAll", query = "SELECT p FROM Partie_1 p"),
    @NamedQuery(name = "Partie_1.findById", query = "SELECT p FROM Partie_1 p WHERE p.id = :id"),
    @NamedQuery(name = "Partie_1.findByGagnant", query = "SELECT p FROM Partie_1 p WHERE p.gagnant = :gagnant"),
    @NamedQuery(name = "Partie_1.findByPerdant", query = "SELECT p FROM Partie_1 p WHERE p.perdant = :perdant"),
    @NamedQuery(name = "Partie_1.findByDuree", query = "SELECT p FROM Partie_1 p WHERE p.duree = :duree"),
    @NamedQuery(name = "Partie_1.findByPhase", query = "SELECT p FROM Partie_1 p WHERE p.phase = :phase")})
public class Partie_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "gagnant")
    private String gagnant;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "perdant")
    private String perdant;
    @Basic(optional = false)
    @NotNull
    @Column(name = "duree")
    private int duree;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "phase")
    private String phase;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPartie")
    private Collection<Joueur_1> joueurCollection;

    public Partie_1() {
    }

    public Partie_1(Integer id) {
        this.id = id;
    }

    public Partie_1(Integer id, String gagnant, String perdant, int duree, String phase) {
        this.id = id;
        this.gagnant = gagnant;
        this.perdant = perdant;
        this.duree = duree;
        this.phase = phase;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGagnant() {
        return gagnant;
    }

    public void setGagnant(String gagnant) {
        this.gagnant = gagnant;
    }

    public String getPerdant() {
        return perdant;
    }

    public void setPerdant(String perdant) {
        this.perdant = perdant;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    @XmlTransient
    public Collection<Joueur_1> getJoueurCollection() {
        return joueurCollection;
    }

    public void setJoueurCollection(Collection<Joueur_1> joueurCollection) {
        this.joueurCollection = joueurCollection;
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
        if (!(object instanceof Partie_1)) {
            return false;
        }
        Partie_1 other = (Partie_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.jeux_421.bean.Partie_1[ id=" + id + " ]";
    }
    
}
