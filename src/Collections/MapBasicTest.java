package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapBasicTest {

    public static void main(String[] a){

        Map<Integer, String> map = new HashMap<>();
        map.put(101, "hyderabad");
        map.put(102, "Bandra");
        map.put(103, "Chennai");
        map.put(104, "Banglore");
/*
         Set<Integer> keysetMap= map.keySet();

      for(Integer key : keysetMap){
      String s =    map.get(key);

          System.out.println(key+ ":" +s);
      }*/


          Set<Map.Entry<Integer, String>> entrySet = map.entrySet();

            for(Map.Entry<Integer, String> entry : entrySet){
               int key = entry.getKey();
               String value =  entry.getValue();

                System.out.println(key+":" + value);
            }

    }
}
