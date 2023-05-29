package org.example.solid.i;

public class PrintScanClient {
    private Printer printer;

    public PrintScanClient(Printer printer) {
        this.printer = printer;
    }

    public void printDocument() {
        printer.print();
    }

    public void scanDocument() {
        printer.scan();
    }
}
