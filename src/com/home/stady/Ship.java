package com.home.stady;

import com.home.stady.container.ContainingWater;
import com.home.stady.main.Constants;
import com.home.stady.main.GenerateRandom;

public class Ship implements ContainingWater {

    private String name;
    private Deck firstDeck;
    private Deck secondDeck;

    public Ship(String name, Deck firstDeck, Deck secondDeck) {
        this.name = name;
        initDeck(firstDeck, secondDeck);
    }

    public Ship(Deck firstDeck, Deck secondDeck) {
        this.name = GenerateRandom.generateName();
        initDeck(firstDeck, secondDeck);
    }

    public Ship(String name, Deck firstDeck) {
        this.name = name;
        initDeck(firstDeck);
        this.secondDeck = null;
    }

    public Ship(Deck firstDeck) {
        this.name = GenerateRandom.generateName();
        initDeck(firstDeck);
        this.secondDeck = null;
    }

    public Ship(String name) {
        this.name = name;
        initDeck(GenerateRandom.generateCountDeck());
    }

    public Ship() {
        this.name = GenerateRandom.generateName();
        initDeck(GenerateRandom.generateCountDeck());
    }

    private void initDeck(Deck deck) {
        if (deck == null) {
            System.out.println(Constants.INCORRECT_DECK);
            this.firstDeck = GenerateRandom.generateDeck();
        } else {
            this.firstDeck = deck;
        }
    }

    private void initDeck(Deck firstDeck, Deck secondDeck) {
        initDeck(firstDeck);
        if (secondDeck == null) {
            System.out.println(Constants.INCORRECT_DECK);
            this.secondDeck = GenerateRandom.generateDeck();
        } else {
            this.secondDeck = secondDeck;
        }
    }

    private void initDeck(int count) {
        this.firstDeck = GenerateRandom.generateDeck();
        this.secondDeck = count == 1 ? null : GenerateRandom.generateDeck();
    }

    public String getName() {
        return name;
    }

    public Deck getFirstDeck() {
        return firstDeck;
    }

    public Deck getSecondDeck() {
        return secondDeck;
    }

    public void setName(String name) {
        if (name == null) {
            System.out.println(Constants.INCORRECT_SHIPNAME);
        } else {
            GenerateRandom.names.add(this.name);
            this.name = name;
        }
    }

    public void setFirstDeck(Deck firstDeck) {
        if (firstDeck == null) {
            if (this.secondDeck == null) {
                System.out.println(Constants.DECK_ONE);
            } else {
                this.firstDeck = this.secondDeck;
                this.secondDeck = null;
            }
        } else {
            this.firstDeck = firstDeck;
        }
    }

    public void setSecondDeck(Deck secondDeck) {
        this.secondDeck = secondDeck;
    }

    public void add(Deck deck) {
        if (deck == null) {
            System.out.println(Constants.DECK_NOT_IS_NULL);
        } else if (this.secondDeck == null) {
            this.secondDeck = deck;
        } else {
            System.out.println(Constants.INCORRECT_COUNT_DECK);
        }
    }

    public void remove(Deck deck) {
        if (deck == null) {
            System.out.println(Constants.DECK_NOT_IS_NULL);
        } else {
            if (this.firstDeck == null || this.secondDeck == null) {
                System.out.println(Constants.DECK_ONE);
            } else {
                if (this.firstDeck == deck) {
                    this.firstDeck = this.secondDeck;
                    this.secondDeck = null;
                } else if (this.secondDeck == deck) {
                    this.secondDeck = null;
                } else {
                    System.out.println(Constants.NON_EXISTENT_DECK);
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Корабль ");
        stringBuilder.append(name)
                .append(":\nпервая палуба - \n")
                .append(firstDeck)
                .append("вторая палуба - ");
        if (secondDeck == null) {
            stringBuilder.append("отсутствует\n");
        } else {
            stringBuilder.append("\n").append(secondDeck);
        }
        return stringBuilder.toString();
    }

    @Override
    public int getWaterMass() {
        int waterMass = this.firstDeck.getWaterMass();
        if (this.secondDeck != null) {
            waterMass += this.secondDeck.getWaterMass();
        }
        return waterMass;
    }
}
