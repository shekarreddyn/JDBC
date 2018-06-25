package preparedstatement;

import java.sql.*;

public class PreparedUpdateStatement {

    public static void main(String[] args) throws SQLException {


        Connection con = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/world", "root", "P@ssw0rd@123");


            String updateQuery = "UPDATE employee SET salary = ? where department = ? and salary = ?";

            PreparedStatement preparedStatement = con.prepareStatement(updateQuery);

            preparedStatement.setDouble(1, 2000);
            preparedStatement.setString(2, "Admin");
            preparedStatement.setDouble(3, 1600

            );

            preparedStatement.executeUpdate();


            String selectQuery = "Select * from employee where department = ? and salary = ? ";
            preparedStatement = con.prepareStatement(selectQuery);
            preparedStatement.setString(1, "Admin");
            preparedStatement.setDouble(2, 2000);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {

                System.out.print(rs.getInt("id") + " ");
                System.out.print(rs.getString("name") + " ");
                System.out.print(rs.getDouble("salary") + " ");
                System.out.print(rs.getString("department") + " ");
                System.out.println();

            }

        } catch (Exception e) {

            e.printStackTrace();

        } finally {

            if (null != con) {

                con.close();
            }
        }


    }
}


