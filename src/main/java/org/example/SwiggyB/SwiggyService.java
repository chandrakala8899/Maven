package org.example.SwiggyB;

import org.example.HomeDemo.Home;
import org.example.HomeDemo.Room;

import java.util.ArrayList;
import java.util.List;

public class SwiggyService {


    public ListOfRestaurent findRestaurant() {


        Address address1= new Address();
        address1 .flatNo = 2-164;
        address1.area = "Hyderabd";
        address1.pincode="509125";

        Address address2= new Address();
        address2.flatNo = 2-164;
        address2.area = "Hyderabd";
        address2.pincode="509125";


        Dish veg = new Dish();
        veg.itemName = "Biryani";
        veg.rating = "4.2";
        veg.price = 500;

        Dish nonveg = new Dish();
        nonveg.itemName = "Starters";
        nonveg.rating = "4.4";
        nonveg.price= 450;


        Restaurent mehfil = new Restaurent();
        mehfil.restaurentName = "Mehfil";
        mehfil.rating = "4.2";
        mehfil.address = address1;


        Restaurent pistaHouse = new Restaurent();
        pistaHouse.restaurentName = "PistaHouse";
        pistaHouse.rating = "4.8";
        pistaHouse.address = address2;

        List<Dish> item = new ArrayList<>();
        item.add(veg);
        item.add(nonveg);

        mehfil.itemList = item;
        System.out.println(mehfil);
         pistaHouse.itemList= item;
        System.out.println(pistaHouse);

        List<Restaurent> restaurents = new ArrayList<>();
        restaurents.add(mehfil);
        restaurents.add(pistaHouse);
       // List<PaymentMethod> paymentMethodList =new ArrayList<>();

        ListOfRestaurent listOfRestaurent = new ListOfRestaurent();
        listOfRestaurent.restaurentList = restaurents;

        return listOfRestaurent;
    }
}