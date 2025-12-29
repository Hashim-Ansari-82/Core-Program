package com.oops.association;

class Mobile {
    String brand;
    int price;
    Mobile(String brand, int price){
        this.brand=brand;
        this.price=price;
    }
    public void show(){
        System.out.println("Mobile Brand = "+brand+"\nMobile Price = "+price+"Lakh");
    }
}
class Charger{
    Mobile m;
    String brand;
    int price;
    Charger(String brand , int price){
        this.brand=brand;
        this.price=price;
    }
    void show(){
        m=new Mobile("I Phone 17 ",1);
        m.show();
        System.out.println("Charger Brand = "+brand+"\nCharger Price = "+price+"K");
    }
}
public class Composition {
    public static void main(String[] args) {
        Charger c =new Charger("Apple ",5);
        c.show();
    }
}
