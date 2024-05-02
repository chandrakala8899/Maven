package org.example.HomeDemo;

import java.util.List;

public class Home {

    public  Address address;

    public List<Room> rooms;

    @Override
    public String toString() {
        return "Home{" +
                "address=" + address +
                ", rooms=" + rooms +
                '}';
    }
}
