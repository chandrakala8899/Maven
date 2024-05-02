package org.example.SwiggyB;
public class RestaurantService {

    public Restaurent getRestaurant(ListOfRestaurent listOfRestaurant, String restaurantName) {
        for (Restaurent restaurent : listOfRestaurant.restaurentList) {
            if (restaurent.restaurentName.equals(restaurantName)) {
                return restaurent;
            }
        }
        return null;
    }

    public Dish getDish(Restaurent restaurant, String dishName) {
        for (Dish dish : restaurant.itemList) {
            if (dish.itemName.equals(dishName)) {
              //  System.out.println("Dish Name : " + dish.itemName);
                return dish;
            }
        }
        System.out.println("Dish Not Found");
        return null;
    }
}
