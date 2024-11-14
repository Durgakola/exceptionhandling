package com.neoteric.polymorphisam.factorydesign;

import com.neoteric.polymorphisam.abstractdemo.AccountService;
import com.neoteric.polymorphisam.abstractdemo.CorporateAccountService;
import com.neoteric.polymorphisam.abstractdemo.RetaileAccountService;
import com.neoteric.polymorphisam.abstractdemo.RetaileAccountServiceImpl;

public class RetaileAccountServiceFactory implements AccountFactory {

    public RetaileAccountService createAccount(){
        return new RetaileAccountServiceImpl();
    }
}
