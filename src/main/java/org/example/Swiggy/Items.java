package org.example.Swiggy;

public class Items {

    public  String itemName;
    public String Price;

    public String rating;

    public String getRating() {
        return rating;
    }

    public String getItemName() {
        return itemName;
    }

    public String getPrice() {
        return Price;
    }

    public Items(String itemName, String price,String rating) {
        this.itemName = itemName;
        this.rating = rating;
        this.Price = price;
    }
}
