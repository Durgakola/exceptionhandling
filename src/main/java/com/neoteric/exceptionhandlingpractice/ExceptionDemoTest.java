package com.neoteric.exceptionhandlingpractice;

public class ExceptionDemoTest {
    public static void main(String[] args) {
        System.out.println("Hello World");
        try {
            ExcetionTest test=new ExcetionTest();
            test.calcualteWithfinally(6);

            System.out.println(" Ticket booking is done");
        }catch (Exception e){
            System.out.println(((InsufficientBalanceException1)e).getCode()+"  "+e.getMessage());
        }

        System.out.println(" I am done calculation");

    }
}
