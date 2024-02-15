import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FilePrinter extends PrinterDecorator {
    public FilePrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String message) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("message.txt"))) {
            writer.write(message);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
