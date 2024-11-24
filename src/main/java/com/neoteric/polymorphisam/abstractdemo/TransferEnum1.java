package com.neoteric.polymorphisam.abstractdemo;

public enum TransferEnum1 {

    INSUFFICIENT_BALANCE("10000","InsufficientBalance");
    private String code;
    private String label;

    TransferEnum1(String code,String label){
        this.code=code;
        this.label=label;
    }

    public String getCode() {

        return code;
    }
    public String getLabel() {

        return label;
    }
}

