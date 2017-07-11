import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by hackerfreak on 30/6/17.
 */
public class SaveBlogServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        //PrintWriter out = response.getWriter();
        String s = request.getSession().getAttribute("newUser").toString();

        String title;
        String content;
        title = request.getParameter("title");
        content = request.getParameter("blogContent");
        String query = "INSERT INTO blog(title,content,uname) VALUES(?,?,?)";

        DBHandler dbHandler = new DBHandler();
        Connection connection = dbHandler.establishConnecton();
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, title);
            ps.setString(2, content);
            ps.setString(3, s);
            int x = ps.executeUpdate();
            RequestDispatcher reqDisSaved=request.getRequestDispatcher("StatusOfTransaction_saved.jsp");
            RequestDispatcher reqDisFailed=request.getRequestDispatcher("StatusOfTransaction_failed.jsp");
            if (x == 1) {
                reqDisSaved.include(request,response);
            } else {
                 reqDisFailed.include(request,response);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
