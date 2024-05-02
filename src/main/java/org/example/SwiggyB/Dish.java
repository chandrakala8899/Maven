package org.example.SwiggyB;

public class Dish {
    public String itemName;
    public String rating;
    public   int price;

    @Override
    public String toString() {
        return "Dish{" +
                "itemName='" + itemName + '\'' +
                ", rating='" + rating + '\'' +
                ", price=" + price +
                '}';
    }
}