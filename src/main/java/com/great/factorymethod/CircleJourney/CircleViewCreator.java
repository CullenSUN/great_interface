package com.great.factorymethod.CircleJourney;

import com.great.factorymethod.Common.*;

public class CircleViewCreator implements ViewCreator {

    @Override
    public View createView() {
        return new CircleView();
    }
    
}
