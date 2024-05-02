package org.example.HomeDemo;

public class Hall  extends Room {
     public  Furniture hallFurniture;
     public  Furniture dinningTableFurniture;


     @Override
     public String toString() {
          return "Hall{" +
                  "hallFurniture=" + hallFurniture +
                  ", dinningTableFurniture=" + dinningTableFurniture +
                  ", fans=" + fans +
                  ", lights=" + lights +
                  '}';
     }
}
