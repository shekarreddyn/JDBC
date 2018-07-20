package Collections;

import java.util.*;
import java.util.HashMap;

public class Collections2 {

    public static  void main(String[] args){

        Map<String, List<String>> map = new HashMap<String, List<String>>();

        List<String> telanganaList = new ArrayList<String>();
        telanganaList.add("Hyderabad");
        telanganaList.add("Warangal");
        telanganaList.add("Karimnagar");

        List<String> mumbaiList = new ArrayList<String>();
        mumbaiList.add("Nagpur");
        mumbaiList.add("Mumbai");
        mumbaiList.add("Bandra");

        List<String> andhraList = new ArrayList<String>();

        andhraList.add("Vijag");
        andhraList.add("Amaravathi");
        andhraList.add("Vijayawada");

        map.put("Telangana", telanganaList);
        map.put("Mumbai", mumbaiList);
        map.put("Andhra Pradesh", andhraList);


    }
}