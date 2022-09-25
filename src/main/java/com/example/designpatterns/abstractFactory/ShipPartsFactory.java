package com.example.designpatterns.abstractFactory;

public interface ShipPartsFactory {
    Anchor createAnchor();
    Wheel createWheel();

}
