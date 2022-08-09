package com.home.stady.container;

public class CylinderShapedContainer extends Container implements ContainingWater {

    public CylinderShapedContainer() {
        super();
    }

    public CylinderShapedContainer(int height, int waterDensity, int diagonal) {
        super(height, waterDensity, diagonal);
    }

    @Override
    public int getWaterMass() {
        return this.getWaterDensity() * calculateVolume();
    }

    @Override
    public int calculateVolume() {
        double radius = this.getDiagonal() >> 1;
        return (int) (Math.PI * radius * this.getHeight());
    }
}
