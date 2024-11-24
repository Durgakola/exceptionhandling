package com.neoteric.hashmap;

import java.util.*;

public class IteratorTest {
    public static void main(String[] args) {
        Employee1 e=new Employee1("1","durga");
        Employee1 e1=new Employee1("2","gopi");
        Employee1 e2=new Employee1("3","naidu");
        Employee1 e3=new Employee1("4","arjun");

        Map<String,Employee1> employee=new HashMap<>();
        employee.put(e.getId(),e);
        employee.put(e1.getId(), e1);
        employee.put(e2.getId(),e2);
        employee.put(e3.getId(),e3);

        Set<Map.Entry<String,Employee1>> entrySet=employee.entrySet();
        Iterator<Map.Entry<String,Employee1>>itr=entrySet.iterator();
        for(; itr.hasNext();){
            Map.Entry<String,Employee1> entry = itr.next();
            System.out.println(" key "+entry.getKey()+" value "+entry.getValue());
        }

        System.out.println("**************streems*************** ");

        employee.entrySet().stream().forEach(entry ->{
            System.out.println("key "+entry.getKey()+" value "+entry.getValue());
        });
    }
}
