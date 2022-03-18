/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jeux_421.bean;

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
 * @author PC MAROC
 */
@Entity
@Table(name = "lancer")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lancer_1.findAll", query = "SELECT l FROM Lancer_1 l"),
    @NamedQuery(name = "Lancer_1.findById", query = "SELECT l FROM Lancer_1 l WHERE l.id = :id"),
    @NamedQuery(name = "Lancer_1.findByGagnant", query = "SELECT l FROM Lancer_1 l WHERE l.gagnant = :gagnant"),
    @NamedQuery(name = "Lancer_1.findByPerdant", query = "SELECT l FROM Lancer_1 l WHERE l.perdant = :perdant")})
public class Lancer_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 90)
    @Column(name = "gagnant")
    private String gagnant;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 90)
    @Column(name = "perdant")
    private String perdant;
    @JoinColumn(name = "id_combi", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Combinaison_1 idCombi;
    @JoinColumn(name = "id_joueur", referencedColumnName = "pseudo")
    @ManyToOne(optional = false)
    private Joueur_1 idJoueur;

    
   
   public Lancer_1() {
    }

    public Lancer_1(Integer id) {
        this.id = id;
    }

    public Lancer_1(Integer id, String gagnant, String perdant) {
        this.id = id;
        this.gagnant = gagnant;
        this.perdant = perdant;
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

    public Combinaison_1 getIdCombi() {
        return idCombi;
    }

    public void setIdCombi(Combinaison_1 idCombi) {
        this.idCombi = idCombi;
    }

    public Joueur_1 getIdJoueur() {
        return idJoueur;
    }

    public void setIdJoueur(Joueur_1 idJoueur) {
        this.idJoueur = idJoueur;
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
        if (!(object instanceof Lancer_1)) {
            return false;
        }
        Lancer_1 other = (Lancer_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.jeux_421.bean.Lancer_1[ id=" + id + " ]";
    }
    
}
