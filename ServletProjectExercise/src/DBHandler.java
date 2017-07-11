


import java.sql.*;


/**
 * Created by hackerfreak on 28/6/17.
 */
public class DBHandler {
    private String DriverName="com.mysql.jdbc.Driver";
    private String connectionURL="jdbc:mysql://localhost:3306/bootcampttn";
    private String uname="root";
    private String pass="toor";
    private Connection con;
    public Connection establishConnecton(){
        try {
            Class.forName(DriverName);
            con= DriverManager.getConnection(connectionURL,uname,pass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return con;
    }
}
