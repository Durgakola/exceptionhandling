package com.neoteric.collections;

import java.util.ArrayList;

public class ArrayListExp {
    public static void main(String[] args) {
        ArrayList<String> arrayList1=new ArrayList<String>();

        arrayList1.add("Rama");
        arrayList1.add("suma");
        arrayList1.add("kusuma");
        arrayList1.add("pooja");

        for(int i=0;i< arrayList1.size();i++){
            System.out.println(arrayList1.get(i));
        }

    }
}
