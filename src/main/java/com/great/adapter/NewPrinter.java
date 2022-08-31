package com.great.adapter;

class NewPrinter implements Printer {
    public void print(String text, PrintingMode mode) {
        switch (mode) {
            case BLACK_AND_WHITE:
            System.out.println("New printer printing in black and white mode happily.");
            break;
            case COLOR:
            System.out.println("New printer printing in color mode happily.");
            break;
        }
        System.out.printf("printing: %s\n", text);
    }
}
