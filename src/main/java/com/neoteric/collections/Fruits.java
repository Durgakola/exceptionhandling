package com.neoteric.collections;

import java.util.HashMap;
import java.util.Map;

public class Fruits {
    public static void main(String[] args) {
//        Map<String,Integer> map=new HashMap<>();
//        map.put("mango",1);
//        map.put("grapes",2);
//        map.put("banana",3);
//        map.put("orange",4);
//        System.out.println(map);
//        System.out.println("unorder map");

        HashMap<String, Integer> people = new HashMap<String, Integer>();

        // Add keys and values (Name, Age)
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);

        for (String i : people.keySet()) {
            System.out.println("Name: " + i + " Age: " + people.get(i));
        }

    }
}
