package com.home.stady.main;

import com.home.stady.Deck;
import com.home.stady.Ship;
import com.home.stady.container.ConeShapedContainer;
import com.home.stady.container.Container;
import com.home.stady.container.CubeShapedContainer;
import com.home.stady.container.CylinderShapedContainer;

public class Main {

    public static void main(String[] args) {

        Ship ship1 = new Ship(new Deck());
        Ship ship2 = new Ship(new Deck(), new Deck());
        Ship ship3 = new Ship();
        Ship ship4 = new Ship("qq", new Deck());
        Ship ship5 = new Ship("ww", new Deck(), new Deck());
        Ship ship6 = new Ship("ee");
        ship1.setSecondDeck(new Deck());
        System.out.println(ship1);
        System.out.println(ship1.getWaterMass());
    }
}
