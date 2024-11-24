package com.neoteric.collections;

import java.util.HashMap;
import java.util.Map;

public class CollectionTest {
    public static void main(String[] args) {
        Employee employee =new Employee("durga","N0001");
        Employee employee1 =new Employee("naidu","N0002");
        Employee employee2 =new Employee("dileep","N0003");

        Map<String,Employee> hashmap=new HashMap<>();
        hashmap.put(employee.getName(), employee);
        hashmap.put(employee1.getName(), employee1);
        hashmap.put(employee2.getName(), employee2);

        System.out.println("Hashmap<String, Employee>:");
//        System.out.println(hashmap);
        hashmap.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

        Map<Employee,Employee> hashmap1=new HashMap<>();
         hashmap1.put(employee,employee1);
         hashmap1.put(employee1,employee2);
         hashmap1.put(employee2,employee);

//        System.out.println("Hashmap<Employee, Employee>:");
         System.out.println(hashmap1);
         hashmap1.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));





    }
}