/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jeux_421.bean;

import java.util.Set;

/**
 *
 * @author PC MAROC
 */
public class Combinaison {
    private String idcombinaison;
    private Set<Dé> des;

    public String getIdcombinaison() {
        return idcombinaison;
    }

    public void setIdcombinaison(String idcombinaison) {
        this.idcombinaison = idcombinaison;
    }

    public Set<Dé> getDes() {
        return des;
    }

    public void setDes(Set<Dé> des) {
        this.des = des;
    }
    
    
}
