package com.great.adapter.old;

public class OldPrinter {
    public void setBlackAndWhiteMode() {
        System.out.println("OldPrinter just changed to black and white printing mode");
    }

    public void setColorMode() {
        System.out.println("OldPrinter just changed to color printing mode");
    }

    public void print(String text) {
        System.out.printf("OldPrinter printing: %s\n", text);
    }
}
