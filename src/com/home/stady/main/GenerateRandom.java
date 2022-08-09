package com.home.stady.main;

import com.home.stady.container.ConeShapedContainer;
import com.home.stady.container.Container;
import com.home.stady.container.CubeShapedContainer;
import com.home.stady.container.CylinderShapedContainer;

import java.util.Random;

public class GenerateRandom {

    public static int generateHeight() {
        Random random = new Random();
        return random.nextInt(10, 101);
    }

    public static int generateDiagonal() {
        Random random = new Random();
        return random.nextBoolean()
                ? Constants.DIAGONAL_BIG
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

    public static Container[] generateArrayContainers() {
        Random random = new Random();
        int countContainers = random.nextBoolean() ? 2 : 4;
        return generateArrayContainers(countContainers);
    }

    public static Container[] generateArrayContainers(int count) {
        Random random = new Random();
        if (count != 2 && count != 4) {
            System.out.println(Constants.INCORRECT_COUNT_CONTAINERS);
        }
        int countContainers = count == 2 || count == 4
                ? count
                : random.nextBoolean() ? 2 : 4;
        Container[] containers;
        if (countContainers == 2) {
            containers = new Container[2];
            for (int i = 0; i < 2; i++) {
                containers[i] = GenerateRandom.generateShapeContainer();
                containers[i].setDiagonal(20);
            }
        } else {
            containers = new Container[4];
            for (int i = 0; i < 4; i++) {
                containers[i] = GenerateRandom.generateShapeContainer();
                containers[i].setDiagonal(10);
            }
        }
        return containers;
    }
}

