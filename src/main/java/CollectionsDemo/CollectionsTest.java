package CollectionsDemo;

import org.example.Swiggy.Items;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class CollectionsTest {
    public static void main(String[] args) {
        Predicate<Restaurant> predicate = (restaurant) -> restaurant.restaurantName.equals("Pista House");
        BiPredicate<Restaurant, Boolean> biPredicate = (restaurant, bipredictboolean) -> restaurant.restaurantName.equals("Mehfil");

        Restaurant restaurant1 = new Restaurant();
        restaurant1.restaurantName = "Mehfil";
        restaurant1.item = "Biryani";

        Restaurant restaurant2 = new Restaurant();
        restaurant2.restaurantName = "Pista House";
        restaurant2.item = "Starters";

        List<Restaurant> restaurantList = new ArrayList<>();
        restaurantList.add(restaurant1);
        restaurantList.add(restaurant2);


        for (int i = 0; i < restaurantList.size(); i++) {
            Restaurant restaurant = restaurantList.get(i);
            System.out.println("Normal For Loop " + restaurant.item);

        }

        Iterator<Restaurant> restaurantIterator = restaurantList.iterator();
        for (; restaurantIterator.hasNext(); ) {
            Restaurant restaurant = restaurantIterator.next();
            if (biPredicate.test(restaurant, predicate.test(restaurant))) {

                System.out.println(" From Iterator Loop  Bi Predict Restaurant Name " + restaurant.restaurantName);

            }
        }
        restaurantList.forEach(restaurant -> {
            System.out.println("Consumer" + restaurant.restaurantName);


//InterView Questions
            // BetWise And Operator
            int x = 12;
            int y = 25;
            // Binary x=1001 ,y=1000
            //1001*1000
            System.out.println(x & y);
            //output=8

            // BetWise OR Operator
            int a = 12;
            int b = 25;
            // Binary x=1001 ,y=1000
            //1001*1000
            System.out.println(x | y);
            //output=29
        });
    }
}
