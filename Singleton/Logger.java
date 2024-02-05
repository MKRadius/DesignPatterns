import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Date;
import java.io.File;

public class Logger {
    private static Logger instance;
    private String fileName;
    private Date date;
    private StringBuffer stringBuffer;

    private Logger() {
        this.fileName = "log.txt";
        this.date = new Date();
        this.stringBuffer = new StringBuffer();
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void write(String message) {
        stringBuffer.append("[" + date.toString() + "] ");
        stringBuffer.append(message);
        stringBuffer.append("\n");
    }

    public void close() {
        try {
            Writer writer = new FileWriter(fileName, true);
            writer.write(stringBuffer.toString());
            stringBuffer.setLength(0);
            writer.close();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getFilePath() {
        File file = new File(fileName);
        return file.getAbsolutePath();
    }
}
