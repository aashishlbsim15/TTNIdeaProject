
import java.sql.*;
/**
 * Created by hackerfreak on 29/6/17.
 */
public class DBInsertClass {

    public static void main(String[] args) {
        String name="shubham";
        int salary=15964;
        String dept="sales";
        String query="DELETE FROM employee";
        String transaction1="insert into employee(name,salary,department) values('rajesh',123654,'operations')";
        String transaction2="insert into employee(name,salary,department) values(?,?,?)";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/bootcampttn","test","toorTest");
            Statement statement=connection.createStatement();
            PreparedStatement ps=connection.prepareStatement(transaction2);
           int resultSet= statement.executeUpdate(query);
//           while (resultSet.next()){
//               System.out.println(resultSet.getString(1)+" "+resultSet.getInt(2)+" "+resultSet.getString("department")+" "+resultSet.getInt("id"));
//           }
            System.out.println("\n\n--------------------------------\n\n");
            System.out.println(statement.executeUpdate(transaction1)+" rows effected");
//            resultSet=statement.executeQuery(query);
//            while (resultSet.next()){
//                System.out.println(resultSet.getString(1)+" "+resultSet.getInt(2)+" "+resultSet.getString("department"));
//            }
            System.out.println("\n\n--------------------------------\n\n");
           ps.setString(1,name);
           ps.setInt(2,salary);
           ps.setString(3,dept);
           ps.executeUpdate();
            System.out.println("\n\n--------------------------------\n\n");

//            resultSet=statement.executeQuery(query);
//            while (resultSet.next()){
//                System.out.println(resultSet.getString(1)+" "+resultSet.getInt(2)+" "+resultSet.getString("department"));
//            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
