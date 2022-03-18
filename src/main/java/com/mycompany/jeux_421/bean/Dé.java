/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jeux_421.bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author PC MAROC
 */
@Entity
public class Dé implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int face = 6;
    private int valueOfDice = 1;
    private Combinaison combinaison;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getFace() {
        return face;
    }

    public void setFace(int face) {
        this.face = face;
    }

    public int getValueOfDice() {
        return valueOfDice;
    }

    public void setValueOfDice(int valueOfDice) {
        this.valueOfDice = valueOfDice;
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
        if (!(object instanceof Dé)) {
            return false;
        }
        Dé other = (Dé) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    /****************************************************************/
    java.util.Random hasard = new java.util.Random();
     int i = hasard.nextInt(21) ; 
    
    @Override
    public String toString() {
        return "com.mycompany.jeux_421.bean.D\u00e9[ id=" + id + " ]";
    }
    
}
