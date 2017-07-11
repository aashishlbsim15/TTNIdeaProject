import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by hackerfreak on 30/6/17.
 */
@WebServlet(name = "loginUser")
public class loginUser extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        request.getSession().invalidate();
        PrintWriter out=response.getWriter();
        String name=request.getParameter("u");
        String pass=request.getParameter("p");
        DBHandler dbHandler=new DBHandler();
        Connection connection=dbHandler.establishConnecton();
        String query="select username from login where username=? AND password=?";
        try {
            PreparedStatement ps=connection.prepareStatement(query);
            ps.setString(1,name);
            ps.setString(2,pass);
            ResultSet resultSet=ps.executeQuery();
            if(resultSet.next())
            {
                String retrivedName;
                retrivedName=resultSet.getString(1);
                HttpSession session=request.getSession();
                session.setAttribute("newUser",retrivedName);
                RequestDispatcher dispatcher=request.getRequestDispatcher("loggedInScreen.jsp");
                dispatcher.include(request,response);
//                out.println(retrivedName);
//               response.sendRedirect("loggedInScreen.jsp");

            }
            else {
                out.println("<h1>Invalid user<h1/>");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getSession(false)==null)
        {
            PrintWriter out=response.getWriter();
            out.println("login first");
        }
    }
}
