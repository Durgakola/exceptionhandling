package com.neoteric.polymorphisam.abstractdemo;

public interface RefundTaxAccountService extends AccountService{

    Account createAccount(String itrtax,String pan);
}
