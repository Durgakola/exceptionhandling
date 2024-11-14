package com.neoteric.interfacedemo;

public class ExcelExportAccountSummary implements EditAccountSummary{
    @Override
    public String export(AccountSummary accountSummary) {
        System.out.println("   Export to excel is done"+i);
        return "Data exported to excel is done";
    }

    @Override
    public void edit(AccountSummary accountSummary) {
        System.out.println(" edit is possible with default "+i);
    }
}
