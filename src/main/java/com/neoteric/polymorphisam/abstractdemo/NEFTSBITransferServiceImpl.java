package com.neoteric.polymorphisam.abstractdemo;

public class NEFTSBITransferServiceImpl extends SbiTransferService{


    @Override
    protected boolean transactionLimitCheck(Account account, Double amount) {
        System.out.println(" Validating transactionLimitCheck for account " + account.getAccount());
            if (amount < 1000000)
                return true;
            else {
                return false;
            }
        }
    }

