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


           ResultSet rs = preparedStatement.executeQuery();

            Map<String, List<String>> employeeMap = new HashMap();


            while (rs.next()) {
                String key = rs.getString("department");
                String value = rs.getString("name");

                if (employeeMap.keySet().contains(key)) {

                    // existing entry
                    List<String> existingList = employeeMap.get(key);
                    existingList.add(value);
                    employeeMap.put(key, existingList);

                } else {

                    // new entry

                    List<String> employeeList = new ArrayList<>();

                    employeeList.add(value);

                    employeeMap.put(key, employeeList);
                }

            }
                  Set<Map.Entry<String, List<String>>> entrySet = employeeMap.entrySet();

            for (Map.Entry<String, List<String>> entry : entrySet) {

              String Keydepartment =    entry.getKey();
                System.out.println(Keydepartment);
               List<String> Valuenames =  entry.getValue();

               for(String value:Valuenames){

                   System.out.print(value);
               }
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
