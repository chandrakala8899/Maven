package org.example.SwiggyB;

import java.util.List;

public class Restaurent {
    public String restaurentName;
    public String rating;


    public  Address address;
    public List<Dish> itemList;

    @Override
    public String toString() {
        return "Restaurent{" +
                "restaurentName='" + restaurentName + '\'' +
                ", rating='" + rating + '\'' +
                ", address=" + address +
                ", itemList=" + itemList +
                '}';
    }
}



