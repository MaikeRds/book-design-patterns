package org.example.solid.i;

public class Main {
    public static void main(String[] args) {
        Printer simplePrinter = new SimplePrinter();
        PrintClient printClient = new PrintClient(simplePrinter);
        printClient.printDocument();

        Printer multifunctionPrinter = new MultifunctionPrinter();
        PrintScanClient printScanClient = new PrintScanClient(multifunctionPrinter);
        printScanClient.printDocument();
        printScanClient.scanDocument();
    }
}
