public class Main {
    public static void main(String[] args) {
        Printer printer = new BasicPrinter();
        printer.print("Hello world!");

        printer = new EncryptedPrinter(printer);
        printer.print("Hello world!");

        printer = new FilePrinter(printer);
        printer.print("Hello world!");
    }
}
