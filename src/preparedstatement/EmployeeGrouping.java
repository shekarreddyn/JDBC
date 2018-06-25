package preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeGrouping {

    public static void main(String[] args) {
        Connection con = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/world", "root", "P@ssw0rd@123");

            String query = "select salary from employee";

            PreparedStatement preparedStatement = con.prepareStatement(query);

           // Set<String> nameSet = new HashSet<String>();

            ResultSet rs = preparedStatement.executeQuery();

            int totalSum =0;
            int count = 0;

            while (rs.next()) {

             //   nameSet.add(rs.getString("name"));

                totalSum = totalSum + rs.getInt("salary");

                count++;
            }

            double average = totalSum/count;

            System.out.println(average);

        } catch (Exception e) {

            e.printStackTrace();

        } finally {

            try{

                if (null != con) {

                    con.close();
                }

            } catch(Exception e ){

                e.printStackTrace();
            }


        }


    }
}
