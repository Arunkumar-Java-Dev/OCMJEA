/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Thoughtknock.MB;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;

/**
 *
 * @author Arunkumar.A
 */
@MessageDriven(activationConfig = {
    @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "jms/MyQueue")
    ,
        @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
})
public class NewMessageBean implements MessageListener {
    
    public NewMessageBean() {
    }
    
    @Override
    public void onMessage(Message message) {
        System.out.println("com.Thoughtknock.MB.NewMessageBean.onMessage()");
        System.out.println("Inside Message Bean");
    }
    
}
