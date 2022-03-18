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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PC MAROC
 */
@Entity
@Table(name = "de")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "De.findAll", query = "SELECT d FROM De d"),
    @NamedQuery(name = "De.findById", query = "SELECT d FROM De d WHERE d.id = :id"),
    @NamedQuery(name = "De.findByFace", query = "SELECT d FROM De d WHERE d.face = :face"),
    @NamedQuery(name = "De.findByValeur", query = "SELECT d FROM De d WHERE d.valeur = :valeur")})
public class De implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "face")
    private int face;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valeur")
    private int valeur;
    @JoinColumn(name = "id_combi", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Combinaison_1 idCombi;

    
    // une methode rouler qui simule le lancer d'1 dé
    public int rouler() { //simulation d'une lancer
		return 1 + (int)(Math.random() * 6); // nombre compris entre 
	}
    
    
    public De() {
    }

    public De(Integer id) {
        this.id = id;
    }

    public De(Integer id, int face, int valeur) {
        this.id = id;
        this.face = face;
        this.valeur = valeur;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getFace() {
        return face;
    }

    public void setFace(int face) {
        this.face = face;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    public Combinaison_1 getIdCombi() {
        return idCombi;
    }

    public void setIdCombi(Combinaison_1 idCombi) {
        this.idCombi = idCombi;
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
        if (!(object instanceof De)) {
            return false;
        }
        De other = (De) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.jeux_421.bean.De[ id=" + id + " ]";
    }
    
}
