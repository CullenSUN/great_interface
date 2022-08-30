package com.great.factorymethod.MobileApp;

import com.great.factorymethod.CircleJourney.CircleViewCreator;
import com.great.factorymethod.SquareJourney.SquareViewCreator;
import com.great.factorymethod.Common.View;
import com.great.factorymethod.Common.ViewCreator;
import java.util.HashMap;

public class Application {
    private HashMap<String, ViewCreator> viewCreators = new HashMap<String, ViewCreator>();

    void onApplicationStart() {
        viewCreators.put("circleJourney", new CircleViewCreator());
        viewCreators.put("squareJourney", new SquareViewCreator());
    }

    void userNavigate(String journey) {
        ViewCreator viewCreator = viewCreators.get(journey);
        if (viewCreator != null) {
            View view = viewCreator.createView();
            double width = view.getWidth();
            double height = view.getHeight();
            System.out.printf("The view is going to be drawn in space %.1f x %.1f.\n", width, height);
            view.draw();
        } else {
            System.out.printf("The journey %s is not supported.\n", journey);
        }
    }

    public static void main(String[] args) {
        Application app = new Application();
        app.onApplicationStart();
        app.userNavigate("circleJourney");
        app.userNavigate("squareJourney");
        app.userNavigate("triangleJourney");
    }
}
