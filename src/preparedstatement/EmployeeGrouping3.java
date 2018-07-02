package preparedstatement;

import java.sql.*;
import java.util.*;

public class EmployeeGrouping3 {

   /* Map : <String, String>
    id : 100, name : Shekar salary : 3000 department : IT

    List<Map<String, String>>

    lopp through it and print*/

    public static void main(String[] args) throws SQLException {


        Connection con = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/world", "root", "P@ssw0rd@123");


            String selectQuery = "SELECT  id, name, salary, department from employee";

            PreparedStatement preparedStatement = con.prepareStatement(selectQuery);


            preparedStatement.executeUpdate();


            String selectQuery = "Select * from employee where department = ? and salary = ? ";
            preparedStatement = con.prepareStatement(selectQuery);
            preparedStatement.setString(1, "Admin");
            preparedStatement.setDouble(2, 2000);

            ResultSet rs = preparedStatement.executeQuery();



        } catch (Exception e) {

            e.printStackTrace();

        } finally {

            if (null != con) {

                con.close();
            }
        }


    }
}
