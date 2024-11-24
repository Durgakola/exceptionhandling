package com.neoteric.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Certificate certificate=new Certificate("1600323421","kanakadurga");
        Certificate certificate1=new Certificate("1700346712","karthik");
        Certificate certificate2=new Certificate("1800386762","karthik");

        System.out.println("certificate1 : "+certificate1.getHollTicketNumber().hashCode()+" certificate2 : "+certificate2.getHollTicketNumber().hashCode());

        Map<String,Certificate> maptest=new HashMap<>();
        maptest.put(certificate.getHollTicketNumber(), certificate);
        maptest.put(certificate1.getHollTicketNumber(),certificate1);
        maptest.put(certificate2.getHollTicketNumber(), certificate2);
        System.out.println(maptest);

        Map<Certificate,String> maptest1=new HashMap<>();
        maptest1.put(certificate, certificate.getName());
        maptest1.put(certificate1, certificate1.getName());
        maptest1.put(certificate2, certificate2.getName());
        System.out.println(maptest1);

    }
}
