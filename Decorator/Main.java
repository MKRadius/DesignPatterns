public class Main {
    public static void main(String[] args) {
        // Print message in console
        Printer printer = new BasicPrinter();
        printer.print("Hello world!");

        // Print encrypted message in console
        Printer printer1 = new EncryptedPrinter(printer);
        printer1.print("Hello world!");

        // Print message in file
        Printer printer2 = new FilePrinter(printer);
        printer2.print("Hello world!");

        // Print encrypted message in file
        Printer printer3 = new EncryptedPrinter(new FilePrinter(new BasicPrinter()));
        printer3.print("Hello World!");
    }
}
