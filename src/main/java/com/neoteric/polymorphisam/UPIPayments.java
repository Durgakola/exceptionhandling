package com.neoteric.polymorphisam;

public interface UPIPayments {

    Payment transfer(String fromMobileNumber,String toNumber,Double amount);

    }
