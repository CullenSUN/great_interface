package com.great.factorymethod.SquareJourney;

import com.great.factorymethod.Common.*;

public class SquareViewCreator implements ViewCreator {

    @Override
    public View createView() {
        return new SquareView();
    }
    
}
