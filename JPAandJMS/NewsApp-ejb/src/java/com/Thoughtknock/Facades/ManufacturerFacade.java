/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Thoughtknock.Facades;

import com.Thoughtknock.Model.Manufacturer;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Arunkumar.A
 */
@Stateless
public class ManufacturerFacade extends AbstractFacade<Manufacturer> {

    @PersistenceContext(unitName = "NewsApp-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ManufacturerFacade() {
        super(Manufacturer.class);
    }
    
}
