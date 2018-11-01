/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Thoughtknock.EnterpriseBeans;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author arun
 */
@Stateless
public class UsertableFacade extends AbstractFacade<Usertable> implements UsertableFacadeLocal {

    //@EJB
    Usertable Usertable=new Usertable();
    @PersistenceContext(unitName = "EnterpriseApplication1-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
public String addName()
{
    Usertable.setPassword(Boolean.FALSE);
    Usertable.setUsername("arun");
    em.persist(Usertable);
    return "success";
}
    public UsertableFacade() {
        super(Usertable.class);
    }
    
}
