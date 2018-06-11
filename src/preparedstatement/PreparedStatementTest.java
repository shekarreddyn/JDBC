package preparedstatement;

import java.sql.*;

public class PreparedStatementTest {

    public static void main(String[] args) throws SQLException {


        Connection con = null;

        try{

            Class.forName("com.mysql.jdbc.Driver");

            con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/world","root","P@ssw0rd@123");

            String query = "select * from employee where salary = ? ";

            PreparedStatement preparedStatement = con.prepareStatement(query);

            preparedStatement.setString(1, "2000");

            ResultSet rs = preparedStatement.executeQuery();

            while(rs.next())
            {

                System.out.print(rs.getInt("id") +" " );
                System.out.print(rs.getString("name") +" " );
                System.out.print(rs.getDouble("salary") +" " );
                System.out.print(rs.getString("department") +" " );
                System.out.println();

            }

        } catch(Exception e){

            e.printStackTrace();

        } finally {

            if(null != con){

                con.close();
            }
        }


    }
}
