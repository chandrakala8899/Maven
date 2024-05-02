package org.example.HomeDemo;

public class Address {
    public String flatNo;
    public String area;
    public String pincod;
    public String country;

    @Override
    public String toString() {
        return "Address{" +
                "flatNo='" + flatNo + '\'' +
                ", area='" + area + '\'' +
                ", pincod='" + pincod + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
