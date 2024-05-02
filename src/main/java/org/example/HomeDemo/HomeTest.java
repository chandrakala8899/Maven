package org.example.HomeDemo;

import java.util.ArrayList;
import java.util.List;

public class HomeTest {

    public static void main(String[] args) {

      RoomService roomService = new RoomService();
         Home home = roomService.getRoom();
        System.out.println(" From List Retriving Data");
        System.out.println(home.rooms.get(0));
        System.out.println(home.rooms.get(1));
        System.out.println(home.rooms.get(2));

    }
}
