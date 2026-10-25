package IteratorPackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratorApplyingOnMaps {

    public static void main(String args[])
    {

        HashMap<String , Integer> map = new HashMap<>();

        map.put("INDIA",54);
        map.put("CHAINA", 65);
        map.put("CHAINB", 76);
        map.put("CHAINC", 35);


      Iterator<Map.Entry<String, Integer>> mapSet =  map.entrySet().iterator();
       // Iterator<String> mpv =  map.values().iterator();
       // Iterator<Integer> mapSet = map.entrySet().iterator();


        while(mapSet.hasNext())
        {
            System.out.println(mapSet.next());
        }






    }
}
