package com.great.adapter;

import com.great.adapter.old.OldPrinter;

class Client {
    public static void main(String[] args) {
        Printer printer1 = new NewPrinter();
        printer1.print("Abcdefg", PrintingMode.COLOR);
        printer1.print("Hijklmn", PrintingMode.BLACK_AND_WHITE);

        Printer printer2 = new OldPrinterAdapter(new OldPrinter());
        printer2.print("Abcdefg", PrintingMode.COLOR);
        printer2.print("Hijklmn", PrintingMode.BLACK_AND_WHITE);
    }
}
