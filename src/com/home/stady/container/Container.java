package com.home.stady.container;

import com.home.stady.main.Constants;
import com.home.stady.main.GenerateRandom;

public class Container implements ContainingWater {

    private int height;
    private int waterDensity;
    private int diagonal;

    protected Container(int height, int waterDensity, int diagonal) {
        setHeight(height);
        setWaterDensity(waterDensity);
        setDiagonal(diagonal);
    }

    protected Container() {
        this.height = GenerateRandom.generateHeight();
        this.waterDensity = GenerateRandom.generateWaterDensity();
        this.diagonal = GenerateRandom.generateDiagonal();
    }

    public int getHeight() {
        return height;
    }

    public int getWaterDensity() {
        return waterDensity;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setHeight(int height) {
        if (height >= Constants.MIN_HEIGHT && height <= Constants.MAX_HEIGHT) {
            this.height = height;
        } else {
            if (this.height >= Constants.MIN_HEIGHT && this.height <= Constants.MAX_HEIGHT) {
                System.out.println(Constants.CORRECT_HEIGHT);
            } else {
                System.out.println(Constants.INCORRECT_HEIGHT);
                this.height = GenerateRandom.generateHeight();
            }
        }
    }

    public void setWaterDensity(int waterDensity) {
        switch (waterDensity) {
            case Constants.WATER_DENSITY_HIGH -> this.waterDensity = Constants.WATER_DENSITY_HIGH;
            case Constants.WATER_DENSITY_SMALL -> this.waterDensity = Constants.WATER_DENSITY_SMALL;
            default -> {
                if (this.waterDensity == Constants.WATER_DENSITY_SMALL
                        || this.waterDensity == Constants.WATER_DENSITY_HIGH) {
                    System.out.println(Constants.CORRECT_WATER_DENSITY);
                } else {
                    System.out.println(Constants.INCORRECT_WATER_DENSITY);
                    this.waterDensity = GenerateRandom.generateWaterDensity();
                }
            }
        }
    }

    public void setDiagonal(int diagonal) {
        switch (diagonal) {
            case Constants.DIAGONAL_HIGH -> this.diagonal = Constants.DIAGONAL_HIGH;
            case Constants.DIAGONAL_SMALL -> this.diagonal = Constants.DIAGONAL_SMALL;
            default -> {
                if (this.diagonal == Constants.DIAGONAL_HIGH
                        || this.diagonal == Constants.DIAGONAL_SMALL) {
                    System.out.println(Constants.CORRECT_DIAGONAL);
                } else {
                    System.out.println(Constants.INCORRECT_DIAGONAL);
                    this.diagonal = GenerateRandom.generateDiagonal();
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Контейнер {высота = " + height
                + ", плотность воды в контейнере = " + waterDensity
                + ", диагональ основания = " + diagonal + '}';
    }

    @Override
    public int getWaterMass() {
        return this.getWaterDensity() * calculateVolume();
    }

    @Override
    public int calculateVolume() {
        return 0;
    }
}
