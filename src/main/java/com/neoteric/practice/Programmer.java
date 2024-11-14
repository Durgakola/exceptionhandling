package com.neoteric.practice;

public class Programmer extends Employee{
    public int bonas=10000;

    public static void main(String[] args) {
        Programmer p=new Programmer();
        System.out.println("Salary : "+p.salary);
        System.out.println("Bonas : "+p.bonas);
    }
}
