package com.neoteric.polymorphisam;

import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PhonePay implements UPIPayments {
  public static Map<String,Double> accountBalanceMap=new HashMap<>();

    public static Map<String, ArrayList<Payment>> accountHistoryMap=new HashMap<>();


    static{
        accountBalanceMap.put("9391976191",20000.0);
        accountBalanceMap.put("8978061025",5000.0);

    }

    //predicate method balance check
    BiPredicate<String,Double> balancecheck=(accountNumber,amt) ->{
        Double accountBalance =accountBalanceMap.get(accountNumber);
        if(accountBalance > amt){
            return true;
        }
        else{
            return false;
        }
    };



    BiPredicate<String,Double> dailyLimitCheck=(accountNumber,amt) -> {
        Double dailyLimit = 10000.0;
        ArrayList<Payment> paymentHistoryList = accountHistoryMap.get(accountNumber);
        paymentHistoryList = accountHistoryMap.get(accountNumber);
        if (paymentHistoryList != null) {
            Double totalTranscationAmount = 0.0;
            for (int i = 0; i < paymentHistoryList.size(); i++) {
                Payment pay = paymentHistoryList.get(i);
                totalTranscationAmount = totalTranscationAmount + pay.getAmount();
            }
            if (totalTranscationAmount < dailyLimit) {
                return true;
            } else {
                return false;
            }
        } else {
            return true;
        }
    };


    @Override
    public Payment transfer(String fromMobileNumber, String toNumber, Double amount) {
        Payment p=new Payment();
        if(balancecheck.test(fromMobileNumber,amount)) {
            if (dailyLimitCheck.test(fromMobileNumber, amount)) {
                Double fromAccountBalance = accountBalanceMap.get(fromMobileNumber);
                Double toAccountBalance = accountBalanceMap.get(toNumber);

                Double fromTotalBalance = fromAccountBalance - amount;
                Double toTotalBalance = toAccountBalance + amount;

                accountBalanceMap.put(fromMobileNumber, fromTotalBalance);
                accountBalanceMap.put(toNumber, toTotalBalance);
                p.setStatus(PaymentStatus.SUCCESS.getLabel());
                p.setTransactionId(UUID.randomUUID().toString());
                p.setUter(UUID.randomUUID().toString());
                p.setTransactiondate(new Date());
                p.setAmount(amount);

                ArrayList<Payment> paymentArrayList = accountHistoryMap.get(fromMobileNumber);
                if (paymentArrayList != null) {
                    paymentArrayList.add(p);

                } else {
                    paymentArrayList = new ArrayList<Payment>();
                    paymentArrayList.add(p);
                    accountHistoryMap.put(fromMobileNumber, paymentArrayList);


                }

            } else {
                p.setStatus(PaymentStatus.FAILED_DAILY_LIMIT.getLabel());
                p.setTransactionId(UUID.randomUUID().toString());
                p.setUter(UUID.randomUUID().toString());
                p.setTransactiondate(new Date());

            }
        }else{
            p.setStatus(PaymentStatus.FAILED.getLabel());
            p.setTransactionId(UUID.randomUUID().toString());
            p.setUter(UUID.randomUUID().toString());
            p.setTransactiondate(new Date());
        }
        return p;

    }
}


//package com.neoteric.polymorphisam;
//
//import java.util.Date;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.UUID;
//import java.util.function.BiPredicate;
//
//public class PhonePay implements UPIPayments {
//    public static Map<String, Double> accountBalanceMap = new HashMap<>();
//    private static final double DAILY_WITHDRAWAL_LIMIT = 5000.0; // Daily limit of 5000
//
//    static {
//        accountBalanceMap.put("9391976191", 10000.0);
//        accountBalanceMap.put("8978061025", 5000.0);
//    }
//
//    // Predicate method for balance check
//    BiPredicate<String, Double> balanceCheck = (accountNumber, amt) -> {
//        Double accountBalance = accountBalanceMap.get(accountNumber);
//        return accountBalance != null && accountBalance >= amt;
//    };
//
//    @Override
//    public Payment transfer(String fromMobileNumber, String toNumber, Double amount) {
//        Payment payment = new Payment();
//
//        // Check if the amount exceeds the daily limit
//        if (amount > DAILY_WITHDRAWAL_LIMIT) {
//            payment.setStatus(PaymentStatus.FAILED.getLabel() + " - Daily limit exceeded");
//            payment.setTransactionId(UUID.randomUUID().toString());
//            payment.setUter(UUID.randomUUID().toString());
//            payment.setTransactiondate(new Date());
//            return payment;
//        }
//
//        // Check if the balance is sufficient
//        if (balanceCheck.test(fromMobileNumber, amount)) {
//            Double fromAccountBalance = accountBalanceMap.get(fromMobileNumber);
//            Double toAccountBalance = accountBalanceMap.get(toNumber);
//
//            Double fromTotalBalance = fromAccountBalance - amount;
//            Double toTotalBalance = (toAccountBalance != null ? toAccountBalance : 0.0) + amount;
//
//            accountBalanceMap.put(fromMobileNumber, fromTotalBalance);
//            accountBalanceMap.put(toNumber, toTotalBalance);
//
//            payment.setStatus(PaymentStatus.SUCCESS.getLabel());
//            payment.setTransactionId(UUID.randomUUID().toString());
//            payment.setUter(UUID.randomUUID().toString());
//            payment.setTransactiondate(new Date());
//        } else {
//            payment.setStatus(PaymentStatus.FAILED.getLabel());
//            payment.setTransactionId(UUID.randomUUID().toString());
//            payment.setUter(UUID.randomUUID().toString());
//            payment.setTransactiondate(new Date());
//        }
//
//        return payment;
//    }
//}
