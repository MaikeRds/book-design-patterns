package org.example.solid.i;
// Cliente que utiliza apenas a funcionalidade de impressão
public class PrintClient {
    private Printer printer;

    public PrintClient(Printer printer) {
        this.printer = printer;
    }

    public void printDocument() {
        printer.print();
    }
}
