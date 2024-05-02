package org.example.HomeDemo;

import java.util.List;

public class Room {

    public List<Fan> fans;
     public List<Light> lights;

    @Override
    public String toString() {
        return "Room{" +
                "fans=" + fans +
                ", lights=" + lights +
                '}';
    }
}
