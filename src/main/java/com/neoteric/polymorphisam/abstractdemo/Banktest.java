package com.neoteric.polymorphisam.abstractdemo;

public class Banktest {
    public static void main(String[] args) {

        RetaileAccountServiceImpl retaileAccountService=new RetaileAccountServiceImpl();

        Account a= retaileAccountService.createAccount("123","222");
        SbiTransferService neftsbiTransfer=new NEFTSBITransferServiceImpl();

        try{
            neftsbiTransfer.transfer(a.getAccount(),"123",10000.0);
            System.out.println("trnasaction successful");
        }catch(InsufficientBalanceException e){
            System.out.println("Transfer failed"+e.getMessage());
        }

    }

}
