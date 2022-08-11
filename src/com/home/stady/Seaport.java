package com.home.stady;

import com.home.stady.container.ContainingWater;
import com.home.stady.main.Constants;
import com.home.stady.main.GenerateRandom;

public class Seaport implements ContainingWater {

    private Ship[] ships = new Ship[10];
    private int size = 0;

    public int size() {
        return size;
    }

    public Ship[] getShips() {
        return ships;
    }

    public void setShips(Ship[] ships) {
        if (ships.length > 10) {
            System.out.println(Constants.MAX_SHIPS);
        } else {
            Seaport seaport = new Seaport(ships);
            this.ships = seaport.ships;
            size = seaport.size();
        }
    }

    public Seaport() {
    }

    private void buildShips(int countShips) {
        for (int i = 0; i < countShips; i++) {
            Ship ship = new Ship();
            ships[i] = ship;
            size++;
        }
    }

    public Seaport(int countShips) {
        if (countShips > 10 || countShips < 1) {
            System.out.println(Constants.INCORRECT_COUNT_SHIPS);
            countShips = GenerateRandom.generateCountShips();
        }
        buildShips(countShips);
    }

    public Seaport(Ship[] ships) {
        int countShips = 0;
        for (Ship ship : ships) {
            if (ship != null) {
                countShips++;
            }
        }
        if (countShips < 0) {
            System.out.println(Constants.INCORRECT_COUNT_SHIPS);
            countShips = GenerateRandom.generateCountShips();
            buildShips(countShips);
            return;
        }
        if (countShips > 10) {
            System.out.println(Constants.MANY_SHIPS);
        }
        for (int i = 0, j = 0; i < countShips && j < 10; i++) {
            if (ships[i] != null) {
                this.ships[j] = ships[i];
                j++;
                size++;
            }
        }
    }

    public void add (Ship ship) {
        if (ship == null) {
            System.out.println(Constants.SHIP_IS_NULL);
            return;
        }
        for (int i = 0; i < ships.length; i++) {
            if (ships[i] == null) {
                ships[i] = ship;
                size++;
                return;
            }
        }
        System.out.println(Constants.MAX_SHIPS);
    }

    public void remove(String shipName) {
        if (ships == null) {
            System.out.println(Constants.SHIPS_IS_NULL);
            return;
        }
        for (int i = 0; i < ships.length; i++) {
            if (ships[i] != null && ships[i].getName().equals(shipName)) {
                GenerateRandom.names.add(shipName);
                ships[i] = null;
                size--;
                return;
            }
        }
    }

    @Override
    public String toString() {
        if (ships == null || size == 0) {
            return Constants.SHIPS_IS_NULL;
        } else {
            StringBuilder stringBuilder = new StringBuilder("В порту находятся корабли:\n\n");
            for (Ship ship : ships) {
                if (ship != null) {
                    stringBuilder.append(ship).append("\n");
                }
            }
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            return stringBuilder.toString();
        }
    }

    @Override
    public int getWaterMass() {
        int sumWaterMass = 0;
        if (this.ships == null) {
            System.out.println(Constants.SHIPS_IS_NULL);
            return Constants.INCORRECT_VALUE;
        } else {
            for (Ship ship : ships) {
                if (ship != null) {
                    sumWaterMass += ship.getWaterMass();
                }
            }
            return sumWaterMass;
        }
    }
}
