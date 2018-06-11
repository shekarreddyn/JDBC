package statement;

import java.sql.*;

public class MySqlDeleteTest {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {


        Connection con = null;

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");

            con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/world","root","P@ssw0rd@123");

            Statement insertStatement
                    = con.createStatement();

            String query = "DELETE from employee where name ='Naveen'";

            insertStatement.executeUpdate(query);

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
