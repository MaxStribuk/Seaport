package com.home.stady.main;

import com.home.stady.container.ConeShapedContainer;
import com.home.stady.container.Container;
import com.home.stady.container.CubeShapedContainer;
import com.home.stady.container.CylinderShapedContainer;

public class Main {

    public static void main(String[] args) {
        Container container1 = new CylinderShapedContainer(100, 2000, 20);
        Container container2 = new CubeShapedContainer(100, 2000, 20);
        Container container3 = new ConeShapedContainer(100, 2000, 20);
        System.out.println(container1);
        System.out.println(container2);
        System.out.println(container3);
        System.out.println(container1.getClass());
        System.out.println(container2.getClass());
        System.out.println(container3.getClass());
        System.out.println(container1.getWaterMass());
        System.out.println(container2.getWaterMass());
        System.out.println(container3.getWaterMass());
    }
}
