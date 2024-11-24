package com.neoteric.hashmap;

import java.util.Objects;

public class Certificate {
    private String hollTicketNumber;
    private String name;

    public Certificate(String hollTicketNumber,String name){
        this.hollTicketNumber=hollTicketNumber;
        this.name=name;
    }

    public String getHollTicketNumber() {
        return hollTicketNumber;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Certificate{" +
                "hollTicketNumber='" + hollTicketNumber + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Certificate that)) return false;
        return Objects.equals(getHollTicketNumber(), that.getHollTicketNumber()) && Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHollTicketNumber(), getName());
    }
}
