package com.neoteric.polymorphisam;

public class InterfaceTest {
    public static void main(String[] args) {
        UPIPayments payments=new PhonePay();

        Payment pay=payments.transfer("9391976191","8978061025",5000.0);
        System.out.println(pay.getTransactionId()+" status:  "+pay.getStatus()+" uter:  "+pay.getUter()+" transactiondate: "+pay.getTransactiondate());


        Payment pay1=payments.transfer("9391976191","8978061025",5000.0);
        System.out.println(pay.getTransactionId()+" status:  "+pay.getStatus()+" uter:  "+pay.getUter()+" transactiondate:"+pay.getTransactiondate());



        Payment pay2=payments.transfer("9391976191","8978061025",3000.0);
        System.out.println(pay.getTransactionId()+" status:  "+pay.getStatus()+" uter:  "+pay.getUter()+" transactiondate:"+pay.getTransactiondate());

        System.out.println("Balance of from account : "+PhonePay.accountBalanceMap.get("9391976191"));
        System.out.println("to account balance : "+PhonePay.accountBalanceMap.get("8978061025"));
    }
}
