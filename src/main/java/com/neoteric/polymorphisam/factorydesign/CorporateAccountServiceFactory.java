package com.neoteric.polymorphisam.factorydesign;


import com.neoteric.polymorphisam.abstractdemo.CorporateAccountService;
import com.neoteric.polymorphisam.abstractdemo.CorporateAccountServiceImpl;

public class CorporateAccountServiceFactory  implements AccountFactory {

    @Override
    public CorporateAccountService createAccount() {
        return new CorporateAccountServiceImpl();

    }
}
