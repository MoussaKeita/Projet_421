/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jeux_421.bean;

import java.io.Serializable;
import java.util.Collection;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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
 * @author PC MAROC
 */
@Entity
@Table(name = "joueur")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joueur_1.findAll", query = "SELECT j FROM Joueur_1 j"),
    @NamedQuery(name = "Joueur_1.findByPseudo", query = "SELECT j FROM Joueur_1 j WHERE j.pseudo = :pseudo"),
    @NamedQuery(name = "Joueur_1.findByMdp", query = "SELECT j FROM Joueur_1 j WHERE j.mdp = :mdp"),
    @NamedQuery(name = "Joueur_1.findByAge", query = "SELECT j FROM Joueur_1 j WHERE j.age = :age"),
    @NamedQuery(name = "Joueur_1.findBySexe", query = "SELECT j FROM Joueur_1 j WHERE j.sexe = :sexe"),
    @NamedQuery(name = "Joueur_1.findByVille", query = "SELECT j FROM Joueur_1 j WHERE j.ville = :ville"),
    @NamedQuery(name = "Joueur_1.findByNbJoueurs", query = "SELECT j FROM Joueur_1 j WHERE j.nbJoueurs = :nbJoueurs")})
public class Joueur_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pseudo")
    private String pseudo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mdp")
    private String mdp;
    @Basic(optional = false)
    @NotNull
    @Column(name = "age")
    private int age;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "sexe")
    private String sexe;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ville")
    private String ville;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nb_joueurs")
    private int nbTokens;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idJoueur")
    private Set<Lancer_1> lancers;
    @JoinColumn(name = "id_partie", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Partie_1 idPartie;

    public Joueur_1() {
    }

    public Joueur_1(String pseudo) {
        this.pseudo = pseudo;
    }

    public Joueur_1(String pseudo, String mdp, int age, String sexe, String ville, int nbJoueurs) {
        this.pseudo = pseudo;
        this.mdp = mdp;
        this.age = age;
        this.sexe = sexe;
        this.ville = ville;
        this.nbTokens = nbTokens;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    

    @XmlTransient
   
    public Partie_1 getIdPartie() {
        return idPartie;
    }

    public int getNbTokens() {
        return nbTokens;
    }

    public void setNbTokens(int nbTokens) {
        this.nbTokens = nbTokens;
    }

    public Set<Lancer_1> getLancers() {
        return lancers;
    }

    public void setLancers(Set<Lancer_1> lancers) {
        this.lancers = lancers;
    }

    public void setIdPartie(Partie_1 idPartie) {
        this.idPartie = idPartie;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pseudo != null ? pseudo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joueur_1)) {
            return false;
        }
        Joueur_1 other = (Joueur_1) object;
        if ((this.pseudo == null && other.pseudo != null) || (this.pseudo != null && !this.pseudo.equals(other.pseudo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.jeux_421.bean.Joueur_1[ pseudo=" + pseudo + " ]";
    }
    
}
