package com.neoteric.polymorphisam.factorydesign;

import com.neoteric.polymorphisam.abstractdemo.AccountService;
import com.neoteric.polymorphisam.abstractdemo.CorporateAccountService;

public interface AccountFactory {
     AccountService createAccount();

}
