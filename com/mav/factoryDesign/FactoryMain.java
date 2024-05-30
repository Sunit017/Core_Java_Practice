package com.mav.factoryDesign;

public class FactoryMain {

    public static void main(String[] args) {

        FactoryDesign factoryDesign=new FactoryDesign();
        Os os= factoryDesign.getInstance("Open");
        os.work();
    }
}
