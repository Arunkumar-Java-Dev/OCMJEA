/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Thoughtknock.Facades;

import com.Thoughtknock.Model.ProductCode;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Arunkumar.A
 */
@Stateless
public class ProductCodeFacade extends AbstractFacade<ProductCode> {

    @PersistenceContext(unitName = "NewsApp-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProductCodeFacade() {
        super(ProductCode.class);
    }
    
}
