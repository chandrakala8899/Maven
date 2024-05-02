package org.example;

public class Address {
    public String Street;
    public String flatNo;
    public String city;
    public String pincode;

    @Override
    public String toString() {
        return "Address{" +
                "Street='" + Street + '\'' +
                ", flatNo='" + flatNo + '\'' +
                ", city='" + city + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }
}
