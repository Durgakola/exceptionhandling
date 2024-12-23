package com.neoteric.polymorphisam.abstractdemo;

import com.neoteric.polymorphisam.Payment;

public class PensionTaxTransferServiceImpl extends SbiTransferService {


    public Boolean balanceCheck(String accountNumber, Double amount) {
        Tax t = TaxServiceImpl.taxMap.get(accountNumber);

        if (t != null) {
            Double eligibleAmount = t.getAmount() * 20 / 100;
            if (amount < eligibleAmount) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean transactionLimitCheck(Account account, Double amount) {
        System.out.println(" Validating transactionLimitCheck for account PensionTaxTransferServiceImpl" + account.getAccount());

        if (amount < 10000)
            return true;
        else {
            return false;
        }

    }
}
