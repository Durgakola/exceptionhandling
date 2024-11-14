package com.neoteric.polymorphisam.abstractdemo;

import com.neoteric.polymorphisam.Payment;

public interface RBIPayment {
    Payment transfer(String fromAccount,String toAccount,Double amount);

}
