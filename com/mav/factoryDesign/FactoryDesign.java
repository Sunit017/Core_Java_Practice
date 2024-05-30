package com.mav.factoryDesign;

public class FactoryDesign {

    public Os getInstance(String str)
    {
        if(str.equals("Open"))
            return new Andriod();
        else if (str.equals("closed"))
            return new Windows();
        else
            return new Mac();
    }
}
