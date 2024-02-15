public class FilePrinter extends PrinterDecorator {
    public FilePrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String message) {
        super.print(message);
        System.out.println("Printing to file: " + message);
    }
}
