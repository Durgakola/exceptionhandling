package com.neoteric.polymorphisam.abstractdemo;

public abstract class SbiTransferService {

    protected abstract boolean transactionLimitCheck(Account account,Double amount);


}
