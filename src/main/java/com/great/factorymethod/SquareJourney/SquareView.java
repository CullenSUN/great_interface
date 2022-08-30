package com.great.factorymethod.SquareJourney;
import com.great.factorymethod.Common.View;

class SquareView extends View {

    @Override
    public double getWidth() {
        return 30.0;
    }

    @Override
    public double getHeight() {
        return 30.0;
    }

    @Override
    public void draw() {
        System.out.println("SquareView draws on screen.");
    }
    
}
