package org.example.HomeDemo;

public class BedRoom  extends Room {

    public Furniture bedRoomFurniture;

    public  Furniture dressingTable;

    @Override
    public String toString() {
        return "BedRoom{" +
                "bedRoomFurniture=" + bedRoomFurniture +
                ", dressingTable=" + dressingTable +
                ", fans=" + fans +
                ", lights=" + lights +
                '}';
    }
}
