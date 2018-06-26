package preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashSet;
import java.util.*;
import java.util.TreeSet;


public class EmployeeGrouping2 {

    public static void main(String[] args) {
        Connection con = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/world", "root", "P@ssw0rd@123");

            String query = "select * from employee";

            PreparedStatement preparedStatement = con.prepareStatement(query);

            Map<String, List<String>> employeeMap = new HashMap<String, List<String>>();

            List<String> departmentList = new ArrayList<String>();


            ResultSet rs = preparedStatement.executeQuery();

            Map<String, List<String>> resultMap = new HashMap<String, List<String>>();

            List<String> valueList = new ArrayList<String>();

            while (rs.next()) {

                String key = rs.getString("department");

                String value = rs.getString("name");

                Set<String> keys = resultMap.keySet();

                if (null != keys && !keys.isEmpty()) {

                    if (keys.contains(key)) {

                        List<String> list = resultMap.get(key);
                        list.add(value);
                        resultMap.put(key, list);

                    } else {

                        List<String> list = new ArrayList<String>();
                        list.add(value);
                        resultMap.put(key, list);

                    }
                } else {

                    List<String> list = new ArrayList<String>();
                    list.add(value);
                    resultMap.put(key, list);
                }
            }

            Set<Map.Entry<String, List<String>>> entry = resultMap.entrySet();


            // IT : A,B,C, D
            // Admin : E,F,G

        } catch (Exception e) {

            e.printStackTrace();

        } finally {

            try {

                if (null != con) {

                    con.close();
                }

            } catch (Exception e) {

                e.printStackTrace();
            }


        }


    }
}
