package org.example;

import java.util.Date;

public class TicketTest {
    public static void main(String [] args){

        Ticket ticket = new Ticket();
        ticket.movieName="Tillu Square";
        ticket.rowNumber="S";
        ticket.seatNo=5;
        ticket.showTime=new Date();
        System.out.println(ticket);
    }
}
