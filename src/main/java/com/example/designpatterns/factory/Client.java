package com.example.designpatterns.factory;

public class Client {
    public static void main(String[] args) {

        Client client = new Client();
        client.print(new WhiteShipFactory(), "whiteShip", "kim@aa.com");
        client.print(new BlackShipFactory(), "whiteShip", "kim@aa.com");

//        Ship whiteShip = new WhiteShipFactory().orderShip("WhiteShip", "kim@aa.com");
//        System.out.println("whiteShip = " + whiteShip);
//
//        Ship blackShip = new BlackShipFactory().orderShip("BlackShip", "kim@aa.com");
//        System.out.println("blackShip = " + blackShip);
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println("shipFactory.orderShip(name, email) = " + shipFactory.orderShip(name, email));
    }
}
