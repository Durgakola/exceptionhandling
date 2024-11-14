package com.neoteric.polymorphisam;

import java.util.Date;

public class Payment {

    private String transactionId;
    private String uter;
    private String status;
    private Date transactiondate;
    private Double Amount;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getUter() {
        return uter;
    }

    public void setUter(String uter) {
        this.uter = uter;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getTransactiondate() {
        return transactiondate;
    }

    public void setTransactiondate(Date transactiondate) {
        this.transactiondate = transactiondate;
    }

    public Double getAmount() {
        return Amount;
    }

    public void setAmount(Double amount) {
        Amount = amount;
    }
}