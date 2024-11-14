package com.neoteric.polymorphisam.abstractdemo;

public interface RetaileAccountService extends AccountService{
    Account createAccount(String adhar,String pan);
}
