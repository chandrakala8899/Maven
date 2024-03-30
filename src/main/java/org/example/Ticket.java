package org.example;

import java.util.Date;

public class Ticket {
    public String movieName;
    public String rowNumber;
    public  int seatNo;
    public Date showTime;

    @Override
    public String toString() {
        return "Ticket{" +
                "movieName='" + movieName + '\'' +
                ", rowNumber='" + rowNumber + '\'' +
                ", seatNo=" + seatNo +
                ", showTime=" + showTime +
                '}';
    }
}
