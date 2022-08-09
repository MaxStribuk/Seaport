package com.home.stady.main;

import com.home.stady.container.ConeShapedContainer;
import com.home.stady.container.Container;
import com.home.stady.container.CubeShapedContainer;
import com.home.stady.container.CylinderShapedContainer;
import com.home.stady.main.Constants;

import java.util.Random;

public class GenerateRandom {

    public static int generateHeight() {
        Random random = new Random();
        return random.nextInt(10, 101);
    }

    public static int generateDiagonal() {
        Random random = new Random();
        return random.nextBoolean()
                ? Constants.DIAGONAL_HIGH
                : Constants.DIAGONAL_SMALL;
    }

    public static int generateWaterDensity() {
        Random random = new Random();
        return random.nextBoolean()
                ? Constants.WATER_DENSITY_SMALL
                : Constants.WATER_DENSITY_HIGH;
    }

    public static Container generateShapeContainer() {
        Random random = new Random();
        int randomNumber = random.nextInt(1, 4);
        return switch (randomNumber) {
            case 1 -> new ConeShapedContainer();
            case 2 -> new CubeShapedContainer();
            case 3 -> new CylinderShapedContainer();
            default -> null;
        };
    }

    public static Container generateShapeContainer(int height, int waterDensity, int diagonal) {
        Random random = new Random();
        int randomNumber = random.nextInt(1, 4);
        return switch (randomNumber) {
            case 1 -> new ConeShapedContainer(height, waterDensity, diagonal);
            case 2 -> new CubeShapedContainer(height, waterDensity, diagonal);
            case 3 -> new CylinderShapedContainer(height, waterDensity, diagonal);
            default -> null;
        };
    }
}

