package com.neoteric.interfacedemo;

public interface ExportAccountSummary {
     int i = 10;

     //when thire is no common functionalaty
     //enforce the open for extenaction and closed for modification
     String export(AccountSummary accountSummary);
}
