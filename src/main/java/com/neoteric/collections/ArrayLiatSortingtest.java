package com.neoteric.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLiatSortingtest {
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<>();
        num.add(12);
        num.add(20);
        num.add(3);
        num.add(23);
        num.add(40);
        Collections.sort(num);
        for(int i:num){
            System.out.println(i);

        }
    }
}
