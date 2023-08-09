package com.digit.javaTraining.LibraryManagement.Registercontroller;

import java.io.IOException;

import com.digit.javaTraining.LibraryManagemet.model.HibernateManager;
import com.digit.javaTraining.LibraryManagemet.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginC extends HttpServlet
{
	@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
       {
           String pwd=req.getParameter("pwd");
           
           int uid = Integer.parseInt(req.getParameter("uid"));
         
           User u = new User();
           
           
          
           u.setPwd(pwd);
           u.setUid(uid);
          

          HibernateManager hbm1 = new HibernateManager();
      

           boolean b = hbm1.login(uid,pwd);

           if(b) {

               System.out.println("success");

           }
    }

}
