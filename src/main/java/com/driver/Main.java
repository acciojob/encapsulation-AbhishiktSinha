package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly ob = new RWOnly();
//        ob.name = "newName";
//        java: name has private access in com.driver.RWOnly

        ob.setName("newName");
    }
  
}