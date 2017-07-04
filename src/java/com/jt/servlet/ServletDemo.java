/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author shrut
 */
public class ServletDemo extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name=request.getParameter("name");
        request.setAttribute("sd", name);
        try{
            RequestDispatcher rd= getServletContext().getRequestDispatcher("/newpage.jsp");
            rd.forward(request, response);
        }
        catch(ServletException E){
         
        } catch (IOException E) {
        }
       
      
    }

    }
