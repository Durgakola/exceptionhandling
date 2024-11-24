package com.neoteric.exceptionhandlingpractice;

public class PaymentService {

    static int seats = 10;

    public String payment(int numberOfSeats) throws Exception {
        try{
        if (numberOfSeats > 5) {
            throw new InsufficientBalanceException1(TransferEnum.INSUFFICIENT_BALANCE.getCode(), TransferEnum.INSUFFICIENT_BALANCE.getLabel());
        }
        }catch (InsufficientBalanceException1 ie){
            System.out.println("Exception InsufficientBalanceException accured "+ie);
            throw ie;
        }catch (Exception e){
            System.out.println("Exception accured "+e);
        }
        return "Success";

    }

}
