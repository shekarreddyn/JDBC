package Collections;

/*
2. Create a map which stores person name as a key and his unique telephone numbers as a value.

        "Shakar" <123456, 2515245>

        Map<String, Set<Integer>>

        Map

        map.put(string, set)

        key       value
        Shekar    Set:
        123456
        767676

        Satyam    Set:
        254848
        458585
*/

import java.util.*;

public class Collections3 {

    public static void main(String[] args){

        Map<String, Set<Integer>> contactMap = new HashMap<>();

        Set<Integer> shekarNumber = new HashSet<>();
        shekarNumber.add(678447899);
        shekarNumber.add(90394950);
        shekarNumber.add(90398085);


        Set<Integer> sumanthNumber = new HashSet<>();
        sumanthNumber.add(678447899);
        sumanthNumber.add(90394950);
        sumanthNumber.add(90398086);

        Set<Integer> anilNumber = new HashSet<>();
        anilNumber.add(678447899);
        anilNumber.add(90394950);
        anilNumber.add(90398085);

        contactMap.put("Shekar", shekarNumber );
        contactMap.put("Sumanth", sumanthNumber );
        contactMap.put("Anil", anilNumber );


        Set<Map.Entry<String, Set<Integer>>> contactNumbers = contactMap.entrySet();

        Set<Integer> uniqueNumbers = new HashSet<Integer>();

        List<Integer> shekarList = new ArrayList<Integer>();
        List<Integer> AnilList = new ArrayList<Integer>();
        List<Integer> SatyamList = new ArrayList<Integer>();

        for (Map.Entry<String, Set<Integer>> contactNumber : contactNumbers) {

            System.out.println();
           // System.out.println(contactNumber.getKey());

            Set<Integer> contacts = contactNumber.getValue();


            for (Integer contact :contacts) {

                if(!uniqueNumbers.contains(contact)){

                    AnilList.add(contact);
                    uniqueNumbers.add(contact);
                } {

                    uniqueNumbers.add(contact);
                }

                uniqueNumbers.add(contact);

            }
        }

        for (Integer uniqueNumber:uniqueNumbers) {

            System.out.println(uniqueNumber);
        }
    }

}
