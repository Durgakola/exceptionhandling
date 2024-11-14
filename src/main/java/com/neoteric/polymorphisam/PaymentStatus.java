package com.neoteric.polymorphisam;

public enum PaymentStatus {
     SUCCESS("Transaction is success"),
    FAILED("Trasaction is failed"),
    FAILED_DAILY_LIMIT("Daily limit exceeded"),
    PENDING("Transaction is pending");

     private String label;
    PaymentStatus(String label){
          this.label=label;

      }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }



}
