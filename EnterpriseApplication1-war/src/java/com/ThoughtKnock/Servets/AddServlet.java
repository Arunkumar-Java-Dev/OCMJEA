/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ThoughtKnock.Servets;

import com.Thoughtknock.EnterpriseBeans.UsertableFacade;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author arun
 */
@WebServlet(name = "AddServlet", urlPatterns = {"/AddServlet"})
public class AddServlet extends HttpServlet {

   // @EJB
    UsertableFacade UsertableFacade=new UsertableFacade();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //    super.doGet(req, resp); //To change body of generated methods, choose Tools | Templates.
        PrintWriter out = resp.getWriter();
        out.println("JSP Example");
        UsertableFacade.addName();
        
   // out.println("<h1> "+UsertableFacade.addName() +"</h1>");
    }

   

}
