package myServs;

import java.io.IOException;
import java.io.PrintWriter;


/**
 * Created by hackerfreak on 27/6/17.
 */
public class Myserv extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String name= request.getParameter("name");
        String pass= request.getParameter("pass");
        PrintWriter p = response.getWriter();
        p.println(name+" "+pass);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
