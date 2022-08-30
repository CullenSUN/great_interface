package com.great.dip.app;

import com.great.dip.sdk.*;;

class Application {
    private CallSDK callSDK;

    void onApplicationStart() {
        callSDK = CallSDKFactory.makeCallSDK(new BatteryServiceImplementation());
    }

    void userDial(String phoneNumber) {
        callSDK.makeCall(phoneNumber);
    }

    public static void main(String[] args) {
        Application app = new Application();
        app.onApplicationStart();
        app.userDial("22228888");
    }
}
