package statement;

import java.sql.*;

public class MySqlAlterTest {


    public static void main(String[] args) throws ClassNotFoundException, SQLException {


        Connection con = null;

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");

            con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/world","root","P@ssw0rd@123");

            Statement statement = con.createStatement();

            String name = "";

            String updateQuery = "UPDATE  employee SET name = 'Shekhar', salary = 1580 where id = 100 ";

            statement.executeUpdate(updateQuery);

            System.out.println();

            String selectQuery = "select * from employee where id = 100";

            ResultSet rs = statement.executeQuery(selectQuery);

            rs.next();

            System.out.print(rs.getString("name") +" " );
            System.out.print(rs.getDouble("salary") +" " );
            System.out.print(rs.getString("department") +" " );
            System.out.println();


        } catch(Exception e){

            e.printStackTrace();

        } finally {

            if(null != con){

                con.close();
            }
        }


    }
}
