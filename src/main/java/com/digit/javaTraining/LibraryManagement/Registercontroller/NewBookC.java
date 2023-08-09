package com.digit.javaTraining.LibraryManagement.Registercontroller;


import java.io.IOException;

import com.digit.javaTraining.LibraryManagemet.model.Book;
import com.digit.javaTraining.LibraryManagemet.model.HibernateManager;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/new")
public class NewBookC extends HttpServlet{
	
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
       {
    	   String Name=req.getParameter("bname");
           String author=req.getParameter("author");
           String category=req.getParameter("category");
           float cost = Float.parseFloat(req.getParameter("cost"));
           String status=req.getParameter("status");
           int bid = Integer.parseInt(req.getParameter("bid"));
         
         Book b = new Book();
           
           
           b.setBname(Name);
          b.setCost(cost);
           b.setCategory(category);
          b.setAuthor(author);
           b.setStatus("INACTIVE");
           b.setBid(bid);

          HibernateManager hbm1 = new HibernateManager();
         hbm1.saveobjbook(b);

           boolean bk = hbm1.saveobjbook(b);

           if(bk) {

               System.out.println("success");

           }
    }

}
