package com.neoteric.polymorphisam.factorydesign;

import com.neoteric.polymorphisam.abstractdemo.CorporateAccountService;

public interface AccountFactory {
     CorporateAccountService createAccount();

}
