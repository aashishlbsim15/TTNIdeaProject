
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;


/**
 * Created by hackerfreak on 29/6/17.
 */
public class FetchData {
    public static void main(String[] args) {
        DBHandler dbHandler=new DBHandler();
        Connection connection=dbHandler.establishConnecton();
        try {
            Statement statement=connection.createStatement();
            String query="select * from employee";
            ResultSet resultSet=statement.executeQuery(query);
            while (resultSet.next())
            {
                System.out.println(resultSet.getString(1)+" "+resultSet.getInt(2)+" "+resultSet.getString(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
