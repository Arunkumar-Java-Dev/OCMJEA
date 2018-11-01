/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ThoughtKnock.Servets;

import com.Thoughtknock.EnterpriseBeans.Usertable;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author arun
 */
@Stateless
public class UsertableFacade extends AbstractFacade<Usertable> {

    @PersistenceContext(unitName = "EnterpriseApplication1-warPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsertableFacade() {
        super(Usertable.class);
    }
    
}
