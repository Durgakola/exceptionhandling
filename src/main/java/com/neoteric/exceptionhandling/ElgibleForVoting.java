package com.neoteric.exceptionhandling;

import java.util.Scanner;

public class ElgibleForVoting {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter age");
        int age= scan.nextInt();
        if(age>=18){
            System.out.println("Elgible for voting");
        }
        else{
            System.out.println("Not Elgible for voting");
        }
    }
}
