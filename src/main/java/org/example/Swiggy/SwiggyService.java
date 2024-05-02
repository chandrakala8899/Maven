package org.example.Swiggy;

import java.util.ArrayList;
import java.util.List;

public class SwiggyService {
    public List<Restaurant>restaurantList;


    public SwiggyService(){
        this.restaurantList= new ArrayList<>();
    }
    public void addProduct(Restaurant restaurant){
        restaurantList.add(restaurant);

    }
    public Items itemAvailable(String rating ,Items items) {
        for (Restaurant restaurant : restaurantList) {
            if (restaurant.Rating .equals(rating)) {
                return items;
            }
        }
        return null;
    }
    public boolean order(String rating ,Items items){

        return true;

    }

}
