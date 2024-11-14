package com.neoteric.exceptionhandling;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the balance");
        int balance= scan.nextInt();
        System.out.println("Enter the amount to be with draw");
        int amount= scan.nextInt();
        if(amount<=balance){
            System.out.println("Successfully credited");
        }
        else {
            try {
                InsufficientBalance insufficientBalance = new InsufficientBalance();
                throw insufficientBalance;
            }
            catch(InsufficientBalance ie){
                System.out.println("InsufficientBalance");
            }
        }
    }
}
