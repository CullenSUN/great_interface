package com.great.factorymethod.CircleJourney;
import com.great.factorymethod.Common.View;

class CircleView implements View {

    @Override
    public double getWidth() {
        return 20.0;
    }

    @Override
    public double getHeight() {
        return 20.0;
    }

    @Override
    public void draw() {
        System.out.println("CircleView draws on screen.");
    }
    
}
