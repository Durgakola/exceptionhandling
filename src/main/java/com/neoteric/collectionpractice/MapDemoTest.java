package com.neoteric.collectionpractice;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapDemoTest {
    public static void main(String[] args) {



        Map<String, Integer> mymarks = new HashMap<>();
        //Insert data into Map
        mymarks.put("Telugu", 98);
        mymarks.put("English", 80);
        mymarks.put("Hindi", 80);
        mymarks.put("Maths", 80);
        mymarks.put("Science", 85);
        mymarks.put("Social", 90);

        //Retrieve data from Map

        Set<Map.Entry<String, Integer>> entrySet = mymarks.entrySet();
        Iterator<Map.Entry<String, Integer>> itr = entrySet.iterator();

        while (itr.hasNext()) {
            Map.Entry<String, Integer> entryMap = itr.next();
            System.out.println(entryMap.getKey() + " value: " + entryMap.getValue());
        }


        mymarks.entrySet().stream().forEach(entry -> {
            System.out.println(entry.getKey() + " value: " + entry.getValue());
        });

        Map<String, Integer> sortedMarks = new TreeMap<>();
        //Insert data into Map
        sortedMarks.put("Telugu", 98);
        sortedMarks.put("English", 80);
        sortedMarks.put("Hindi", 80);
        sortedMarks.put("Maths", 80);
        sortedMarks.put("Science", 85);
        sortedMarks.put("Social", 90);

        sortedMarks.entrySet().stream().forEach(entry -> {
            System.out.println("sorted using Tree Map " + entry.getKey() + "value: " + entry.getValue());
        });


        Map<EmployeeEntity, EmployeeEntity> myEmployeeMap = new TreeMap<>();
        //Insert data into map
        EmployeeEntity tiruEmp = new EmployeeEntity("Tirumala", "NEO3", true);
        tiruEmp.setSalary(40000.0);
        tiruEmp.setAadhar("1");

        EmployeeEntity durgaEmp = new EmployeeEntity("kanakadurga", "NEO1", true);
        durgaEmp.setSalary(30000.0);
        durgaEmp.setAadhar("2");

        EmployeeEntity lakshmiEmp = new EmployeeEntity("Lakshmi", "NEO2", true);
        EmployeeEntity lakshmi1Emp = new EmployeeEntity("Lakshmi", "NEO2", true);
        lakshmiEmp.setSalary(30000.0);
        lakshmiEmp.setAadhar("3");

        EmployeeEntity naidu = new EmployeeEntity("Naidu", "NEO4", false);
        naidu.setSalary(12000.0);
        naidu.setAadhar("4");

        System.out.println(tiruEmp.hashCode());
        System.out.println(durgaEmp.hashCode());
        System.out.println(lakshmiEmp.hashCode());
        System.out.println(lakshmi1Emp.hashCode());


        myEmployeeMap.put(tiruEmp, tiruEmp);
        myEmployeeMap.put(durgaEmp, durgaEmp);
        myEmployeeMap.put(lakshmiEmp, lakshmiEmp);
        myEmployeeMap.put(lakshmi1Emp, lakshmi1Emp);
        myEmployeeMap.put(naidu, naidu);


        long empCount = myEmployeeMap.entrySet().stream().count();
        System.out.println(empCount);


        long activeEmpCount = myEmployeeMap.entrySet().stream()
                .filter(mapEntry -> {
                    return mapEntry.getValue().isStatus();
                }).count();
        System.out.println(activeEmpCount);


        List<Emp> empListForPayroll = myEmployeeMap.entrySet().stream()
                .filter(mapEntry -> {
                    return mapEntry.getValue().isStatus();
                }).map(myEntry -> {
                    Emp e =new Emp();
                    e.setEmpId(myEntry.getValue().getEmpId());
                    e.setSalary(myEntry.getValue().getSalary());
                    e.setName(myEntry.getValue().getName());

                    return e;

                }).collect(Collectors.toList());
      System.out.println(empListForPayroll);
   }
}

