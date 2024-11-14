package com.neoteric.interfacedemo;

public class PdfExportAccountSummary implements ExportAccountSummary {
    @Override
    public String export(AccountSummary accountSummary) {
        System.out.println(" Export to Pdf is done"+i);
        return " Data exported toPDF is done" ;
    }
}
