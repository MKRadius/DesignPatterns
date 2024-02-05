public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.setFileName("new_log.txt"); // Change file name
        logger.write("Simulation started");
        logger.write("Processing data...");
        logger.write("Simulation finished");
        System.out.println("Log file path: " + logger.getFilePath());
        logger.close(); // Remember to close the logger

        // //Test if can still write to file after changing file name
        // Logger newLogger = Logger.getInstance();
        // newLogger.write("Writing to new file");
        // newLogger.setFileName("another_log.txt");
        // newLogger.write("Writing to another file");
        // newLogger.close();

        // System.out.println("Log file path: " + newLogger.getFilePath());

        // // Test if can append to old file
        // Logger oldLogger = Logger.getInstance();
        // oldLogger.setFileName("new_log.txt"); 
        // oldLogger.write("Writing to old file");
        // oldLogger.close();
    }
}