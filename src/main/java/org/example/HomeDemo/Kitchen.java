package org.example.HomeDemo;

public class Kitchen  extends Room{

    public  Gas gas;
    public  String Fridge;
    public  String cooker;
    public Furniture  kitchenFurniture;

    @Override
    public String toString() {
        return "Kitchen{" +
                "gas=" + gas +
                ", Fridge='" + Fridge + '\'' +
                ", cooker='" + cooker + '\'' +
                '}';
    }
}
