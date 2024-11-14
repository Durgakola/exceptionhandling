package com.neoteric.polymorphisam.abstractdemo;

public class BankCustService {
    public static void main(String[] args) {
        CorporateAccountServiceImpl corporateAccountService = new CorporateAccountServiceImpl();

        Account a = new Account();
    }
}



////        AccountFactory factory=new RetaileAccountServiceFactory();
//        RetaileAccountService custService= (RetaileAccountService)factory.createAccount();
//        Account account = custService.createAccount("1234","2222");
//
//    }

