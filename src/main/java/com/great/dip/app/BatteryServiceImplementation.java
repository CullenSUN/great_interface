package com.great.dip.app;

import com.great.dip.sdk.*;

class BatteryServiceImplementation implements BatteryService {
    @Override
    public double getBatteryState() {
        // just for demo purpose
        double percentage = 1.0 / 2.0;
        return percentage;
    }
}
