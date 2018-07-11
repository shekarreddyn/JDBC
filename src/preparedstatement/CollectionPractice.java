package preparedstatement;

import java.util.*;

public class CollectionPractice {

    public static void main(String[] args) {

        Map<Integer, List<String>> map = new HashMap<>();

        List<String> employeeName = new ArrayList<String>();
        employeeName.add("Shekar");
        employeeName.add("Raj");
        employeeName.add("varun");

       map.put(2000, employeeName);


        List<String> employeeName1 = new ArrayList<String>();
        employeeName1.add("John");
        employeeName1.add("Karthik");
        employeeName1.add("Tarun");

        map.put(3000, employeeName1);


        List<String> employeeName2 = new ArrayList<String>();
        employeeName2.add("Arun");
        employeeName2.add("Vijay");
        employeeName2.add("Mahesh");

        map.put(4000, employeeName2);

       Set<Map.Entry<Integer, List<String>>>  entryMap = map.entrySet();
        List<List<String>> employeeValues = new ArrayList<>();
       for(Map.Entry<Integer, List<String>> entry : entryMap){

           System.out.println(entry.getKey());

            employeeValues.add(entry.getValue());

        }
        for (List<String> employeeValue : employeeValues) {
            System.out.println(employeeValue);
        }
    }



}
