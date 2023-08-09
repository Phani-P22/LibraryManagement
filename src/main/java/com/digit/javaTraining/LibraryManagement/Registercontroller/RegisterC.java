package com.digit.javaTraining.LibraryManagement.Registercontroller;

import java.io.IOException;

import com.digit.javaTraining.LibraryManagemet.model.HibernateManager;
import com.digit.javaTraining.LibraryManagemet.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/Reg")
public class RegisterC extends  HttpServlet{
       @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
       {
    	   String Name=req.getParameter("uname");
           String pwd=req.getParameter("pwd");
           String Address=req.getParameter("addr");
           String phone=req.getParameter("phone");
           String email=req.getParameter("email");
           String status=req.getParameter("status");
           int UID = Integer.parseInt(req.getParameter("uid"));
         
           User u = new User();
           
           
           u.setUname(Name);
           u.setStatus(status);
           u.setPwd(pwd);
           u.setEmail(email);
           u.setUid(UID);
           u.setPhone(phone);
           u.setStatus("INACTIVE");
           u.setAddr(Address);

          HibernateManager hbm1 = new HibernateManager();
          hbm1.saveobj(u);

           boolean b = hbm1.saveobj(u);

           if(b) {

               System.out.println("success");

           }
    }

}
