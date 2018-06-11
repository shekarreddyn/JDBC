package statement;

import java.sql.*;

public class MySqlTest {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {


        Connection con = null;

        try{

            Class.forName("com.mysql.jdbc.Driver");

            con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/world","root","P@ssw0rd@123");

            Statement statement = con.createStatement();

            String query = "select * from employee";

            ResultSet rs = statement.executeQuery(query);

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
