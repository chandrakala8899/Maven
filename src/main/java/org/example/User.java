package org.example;

public class User {
    public String userName;
    public String passWord;
   public  Address address;

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", address=" + address +
                '}';
    }
}
