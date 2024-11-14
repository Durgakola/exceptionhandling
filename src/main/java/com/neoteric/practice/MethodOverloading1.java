package com.neoteric.practice;

public class MethodOverloading1 {
    public void add(int a,int b){
        System.out.println(a+b);
    }
    public void add(int c,int d,int f){
        System.out.println(c+d-f);
    }
    public void add(int k,double l){
        System.out.println(k*l);
    }

    public static void main(String[] args) {
        MethodOverloading1 m=new MethodOverloading1();
        m.add(12,34);
        m.add(23,45,34);
        m.add(12,12.0);

    }
}
