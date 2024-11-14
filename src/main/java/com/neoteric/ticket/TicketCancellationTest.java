package com.neoteric.ticket;

public class TicketCancellationTest {
    public static void main(String[] args) {
        TicketCancellation cancellation = new TicketService();
        double refundAmount = cancellation.cancellTicket(2,000.0);
        System.out.println(   " Refund Amount " + refundAmount );
    }
}
