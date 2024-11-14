package com.neoteric.exceptionhandlingpractice;

public enum TransferEnum {
    INSUFFICIENT_BALANCE("InsufficientBalance","10000");
    private String label;
    private String code;
     TransferEnum(String label,String code){
        this.label=label;
        this.code=code;
    }

    public String getLabel() {

         return label;
    }

    public String getCode() {

         return code;
    }
}
