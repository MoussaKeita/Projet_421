/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jeux_421.bean.dao;

import java.util.List;

/**
 *
 * @author PC MAROC
 */
public abstract class Dao<D> {
     public abstract D find(int id) throws DAOException;

    //public abstract D findByIntitule(String intitule) throws DAOException;
    /**
     * Rend persistant un objet qui n'avait pas encore de rÃ©prÃ©sentation sur le support de persistance
     * @param data l'objet Ã  rendre persistant
     * @throws DAOException en cas de problÃ¨me
     */
    public abstract void create(D data) throws DAOException;

    /**
     * Met Ã  jour le contenu correspondant Ã  l'objet sur le support persistant (l'objet
     * avait dÃ©jÃ  une reprÃ©sentation sur le support persistant)
     * @param data l'objet modifiÃ© dont le contenu est Ã  mettre Ã  jour
     * @throws DAOException en cas de problÃ¨me
     */
    public abstract void update(D data) throws DAOException;

    /**
     * Efface du support persistant le contenu Ã©quivalent Ã  l'objet
     * @param data l'objet Ã  supprimer 
     * @throws DAOException en cas de problÃ¨me
     */
    public abstract void delete(D data) throws DAOException;
    
   public abstract List<D> findAll();

    public void DAO() throws DAOException {
    }
}
