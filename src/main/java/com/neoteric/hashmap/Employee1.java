package com.neoteric.hashmap;

public class Employee1 {
    private String id;
    private String name;
    public Employee1(String id,String name){
        this.id=id;
        this.name=name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
