package com.great.adapter;

enum PrintingMode {
    BLACK_AND_WHITE,
    COLOR
}

interface Printer {
    public void print(String text, PrintingMode mode);
}
