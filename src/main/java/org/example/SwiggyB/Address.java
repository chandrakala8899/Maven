package org.example.SwiggyB;

public class Address {
     public int flatNo;
     public  String area;
     public  String pincode;

     @Override
     public String toString() {
          return "Address{" +
                  "flatNo=" + flatNo +
                  ", area='" + area + '\'' +
                  ", pincode='" + pincode + '\'' +
                  '}';
     }
}
