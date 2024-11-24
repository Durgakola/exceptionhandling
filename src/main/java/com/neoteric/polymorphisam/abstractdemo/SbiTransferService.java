package com.neoteric.polymorphisam.abstractdemo;

import com.neoteric.exceptionhandlingpractice.TransferEnum;
import com.neoteric.polymorphisam.Payment;
import com.neoteric.polymorphisam.PaymentStatusEnum;

import java.util.Date;
import java.util.UUID;
import java.util.function.Function;

public abstract class SbiTransferService implements  RBIPayment {

    /*  BiPredicate<String,Double> balanceCheck = (accountNumber, amt) -> {
       Account accountBalance = SBIAccountDBService.accountMap.get(accountNumber);
        if (accountBalance != null &&  accountBalance.getBalance() > amt){
            return  true;
        }else {
            return  false;
        }

    };*/


    public  Boolean balanceCheck(String accountNumber,Double amount){
        Account accountBalance = SBIAccountDBService.accountMap.get(accountNumber);
        if (accountBalance != null &&  accountBalance.getBalance() > amount){
            return  true;
        }else {
            return  false;
        }
    }


// Abstract class can have concrete methods and abstract method

    // if class has a abstract method class must be a abstract \

    // if class marked as a abstract there is no rule to have a abstract method

  /*  Function<Double,Payment> errorSupplier = (amount) -> {
        Payment p = new Payment();
        p.setStatus(PaymentStatusEnum.FAILED.getLabel());
        p.setTransactionId(UUID.randomUUID().toString());
        p.setUter(UUID.randomUUID().toString());
        p.setTransactiondate(new Date());
        p.setAmount(amount);
        return  p;
    };*/
    protected abstract boolean transactionLimitCheck(Account account,Double amount);

    @Override
    public Payment transfer(String fromAccount, String toAccount, Double amount) throws InsufficientBalanceException {
        Payment p = new Payment();
        // balance check
        if (this.balanceCheck(fromAccount,amount)) {
            Account account =   SBIAccountDBService.accountMap.get(fromAccount);
            // transaction limit
            if(this.transactionLimitCheck(account,amount)){
                p.setStatus(PaymentStatusEnum.SUCCESS.getLabel());
                p.setTransactionId(UUID.randomUUID().toString());
                p.setUter(UUID.randomUUID().toString());
                p.setTransactiondate(new Date());
                p.setAmount(amount);

            }
            else{
                throw new InsufficientBalanceException(TransferEnum1.INSUFFICIENT_BALANCE.getCode(), TransferEnum1.INSUFFICIENT_BALANCE.getLabel());
            }

        }
        return  p;
    }
}
