public class EncryptedPrinter extends PrinterDecorator {
    public EncryptedPrinter(Printer printer) {
        super(printer);
    }

    private String encrypt(String message) {
        return "Encrypted: " + message;
    }

    @Override
    public void print(String message) {
        super.print(encrypt(message));
    }
}
