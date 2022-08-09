package com.home.stady.container;

public class ConeShapedContainer extends Container implements ContainingWater {

    public ConeShapedContainer() {
        super();
    }

    public ConeShapedContainer(int height, int waterDensity, int diagonal) {
        super(height, waterDensity, diagonal);
    }

    @Override
    public int getWaterMass() {
        return this.getWaterDensity() * calculateVolume();
    }

    @Override
    public int calculateVolume() {
        double radius = this.getDiagonal() >> 1;
        return (int) (radius * radius * this.getHeight() * Math.PI / 3);
    }
}
