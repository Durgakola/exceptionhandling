package com.neoteric.polymorphisam.abstractdemo;

import com.neoteric.polymorphisam.Payment;
import com.neoteric.polymorphisam.factorydesign.AccountFactory;

public class BankCustService {
    public static void main(String[] args) {

        RetaileAccountServiceImpl retailAccountService = new RetaileAccountServiceImpl();

        Account a = retailAccountService.createAccount("1234", "22222");

    }
}