package com.example.designpatterns.abstractFactory;

public class WhiteShipPartsFactory implements ShipPartsFactory {


    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }
}
