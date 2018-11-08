/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ThoughKnock.Servlets;

import com.ThoughtKnock.SessionBeans.SessionManagerBean;
import com.Thoughtknock.Facades.CustomerFacade;
import com.Thoughtknock.Model.Customer;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.Iterator;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Arunkumar.A
 */
@WebServlet(name = "ListNews", urlPatterns = {"/ListNews"})
public class ListNews extends HttpServlet {
   @EJB
    private SessionManagerBean sessionManagerBean;
    @EJB
    private CustomerFacade CustomerFacade;
  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      request.getSession(true);
        response.setContentType("text/html;charset=UTF-8");
      PrintWriter  out=response.getWriter();
        out.println("<h1>Servlet ListNews at " + request.getContextPath () + "</h1>");

List news = CustomerFacade.findAll();
for (Iterator it = news.iterator(); it.hasNext();) {
    Customer elem = (Customer) it.next();
    out.println(" <b>"+elem.getCity()+" </b><br />");
    out.println(elem.getAddressline1()+"<br /> ");
}
out.println("<a href='PostMessage'>Add new message</a>");
out.println("<br><br>");
out.println(sessionManagerBean.getActiveSessionsCount() + " user(s) reading the news.");

out.println("</body>");
    }
    

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
