package org.example.Swiggy;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    public  String Rating;

    public String getRating() {
        return Rating;
    }

    public List<Items>itemsList;

    public Restaurant(String rating){
        this.Rating = rating;
        this.itemsList =  new ArrayList<>();

    }
    public  void item( Items item){
        itemsList.add(item);

    }
    public  boolean available(Items item){
        return itemsList.contains(item);
    }
}
