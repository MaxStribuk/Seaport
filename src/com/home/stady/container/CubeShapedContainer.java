package com.home.stady.container;

public class CubeShapedContainer extends Container implements ContainingWater {

    public CubeShapedContainer() {
        super();
    }

    public CubeShapedContainer(int height, int waterDensity, int diagonal) {
        super(height, waterDensity, diagonal);
    }

    @Override
    public int getWaterMass() {
        return this.getWaterDensity() * calculateVolume();
    }

    @Override
    public int calculateVolume() {
        double sideSquare = this.getDiagonal() / Math.sqrt(2);
        return (int) Math.pow(sideSquare, 3);
    }
}
