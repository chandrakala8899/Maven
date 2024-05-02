package org.example.Map;

import java.util.Objects;

public class Ticket {

    public String  price;
    public String  PNR;

    @Override
    public int hashCode() {
        return Objects.hash(price, PNR);
    }

    public boolean equals(Object obj){
        if(this==obj){
            return true;

        }
        if(this.getClass()!=obj.getClass()){
            return false;
        }
       Ticket ticket= (Ticket) obj;
        return this.PNR.equals(ticket.PNR) &&
                this.price.equals(ticket.price);

    }


    @Override
    public String toString() {
        return "Ticket{" +
                "price='" + price + '\'' +
                ", PNR='" + PNR + '\'' +
                '}';
    }
}
