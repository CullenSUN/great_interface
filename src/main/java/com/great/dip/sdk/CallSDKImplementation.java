package com.great.dip.sdk;

class CallSDKImplementation implements CallSDK {
    private BatteryService batteryService;

    public CallSDKImplementation(BatteryService batteryService) {
        this.batteryService = batteryService;
    }

    @Override
    public void makeCall(String phoneNumber) {
        System.out.printf("Calling number %s \n", phoneNumber);
        System.out.println("Call for a long time, and the program would like to check the battery state.");
        double state = batteryService.getBatteryState();
        System.out.printf("Battery state got from batteryService is %.2f.\n", state);
    }
}
