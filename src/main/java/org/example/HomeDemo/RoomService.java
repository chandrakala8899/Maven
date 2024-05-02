package org.example.HomeDemo;

import java.util.ArrayList;
import java.util.List;

public class RoomService {

    public Home getRoom() {

            Fan fan1 = new Fan();
            fan1.fanType = " Table Fan ";
            Fan fan2 = new Fan();
            fan2.fanType = " Normal Fan ";

            Light light1 = new Light();
            light1.lightType = " CFL";
            Light light2 = new Light();
            light2.lightType = " Tube Light ";


            List<Light> lights = new ArrayList<>();
            lights.add(light1);
            lights.add(light2);

            List<Fan> fans = new ArrayList<>();
            fans.add(fan1);
            fans.add(fan2);

            Gas gas = new Gas();
            gas.gasType = "LPG";


            Furniture furniture1 = new Furniture();
            furniture1.furnitureType = "BedCot";
            Furniture furniture2 = new Furniture();
            furniture2.furnitureType = "DressingTable";
            Furniture furniture3 = new Furniture();
            furniture3.furnitureType = "Shofa Set";
            Furniture furniture4 = new Furniture();
            furniture4.furnitureType = "Dinning Table";
            Furniture furniture5 = new Furniture();
            furniture5.furnitureType = "Dinning Table";


            Kitchen kitchen = new Kitchen();
            //kitchen.lights= lights;
            //kitchen.fans = fans;
            kitchen.gas = gas;
            kitchen.cooker = "Rice Cooker";
            kitchen.Fridge = "Normal";
            kitchen.kitchenFurniture = furniture5;


            BedRoom bedRoom = new BedRoom();
            bedRoom.bedRoomFurniture = furniture1;
            bedRoom.dressingTable = furniture2;
            bedRoom.fans = fans;
            bedRoom.lights = lights;

            Hall hall = new Hall();
            hall.dinningTableFurniture = furniture3;
            hall.hallFurniture = furniture4;
            hall.fans = fans;
            hall.lights = lights;


            List<Room> rooms = new ArrayList<>();
            rooms.add(kitchen);
            rooms.add(bedRoom);
            rooms.add(hall);

            Address address = new Address();
            address.flatNo = "2-164";
            address.area = "Manopad";
            address.pincod = "123455";
            address.country = "India";


            Home home = new Home();
            home.rooms = rooms;
            home.address = address;
            System.out.println(home);

            return home;
        }

}

