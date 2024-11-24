package com.neoteric.collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LinkedHashMapexp {
    public static void main(String[] args) {
        Map<String,Integer> map=new LinkedHashMap<>();
        map.put("mango",1);
        map.put("grapes",2);
        map.put("banana",3);
        map.put("orange",4);

        // Print keys
        //map.clear();
        System.out.println(map);
        System.out.println(map.size());
        System.out.println("LinkedHashMap is the order ");
    }
}
