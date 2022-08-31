package com.great.adapter;

import com.great.adapter.old.OldPrinter;

class OldPrinterAdapter implements Printer {
    private OldPrinter oldPrinter;

    OldPrinterAdapter(OldPrinter oldPrinter) {
        this.oldPrinter = oldPrinter;
    }

    public void print(String text, PrintingMode mode) {
        switch (mode) {
            case BLACK_AND_WHITE:
            oldPrinter.setBlackAndWhiteMode();
            break;
            case COLOR:
            oldPrinter.setColorMode();
            break;
        }
        oldPrinter.print(text);
    }
}
