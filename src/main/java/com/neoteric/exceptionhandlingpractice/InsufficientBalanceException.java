package com.neoteric.exceptionhandlingpractice;

public class InsufficientBalanceException extends Exception{
   public String code;
   public InsufficientBalanceException(String code,String message,Throwable throwable){
       super(message,throwable);
       this.code=code;
   }
   public InsufficientBalanceException(String code,String message){
       super(message);
       this.code=code;
   }

    public String getCode() {
        return code;
    }
}
