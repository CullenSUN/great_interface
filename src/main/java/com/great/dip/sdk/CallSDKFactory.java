package com.great.dip.sdk;

public class CallSDKFactory {
    public static CallSDK makeCallSDK(BatteryService batteryService) {
        return new CallSDKImplementation(batteryService);
    }
}
