package statement;

import java.sql.*;

public class MysqlInsertTest {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {


        Connection con = null;

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");

            con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/world","root","P@ssw0rd@123");

            Statement insertStatement
                    = con.createStatement();

            String query = "INSERT into employee(id, name, salary, department) values(110, 'Naveen', 1500, 'IT' )";

            insertStatement.executeUpdate(query);

            System.out.println();

            String selectQuery = "select * from employee where id = 110";

            Statement selectStatement = con.createStatement();

            ResultSet rs = selectStatement.executeQuery(selectQuery);

            while(rs.next()){

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
