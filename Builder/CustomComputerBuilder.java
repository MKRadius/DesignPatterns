import java.util.Scanner;

public class CustomComputerBuilder implements ComputerBuilder {
    private String[][] components = {
        {"Intel Core i7-14700K", "Intel Core i9-14900K", "AMD Ryzen 9 5900X", "AMD Ryzen 9 5950X"},
        {"4", "8", "16", "32", "64", "128"},
        {"512GB SSD", "1TB SSD", "2TB SSD", "4TB SSD"},
        {"Integrated Graphics", "Nvidia RTX 4090", "Nvidia RTX 4090Ti", "AMD Radeon RX 6900 XT", "AMD Radeon RX 6800 XT"},
        {"Windows 11 Pro", "Windows 11 Enterprise", "Windows 11 Education", "macOS Monterey", "Ubuntu 22.04 LTS"}
    };

    private Computer computer;
    private Scanner scanner = new Scanner(System.in);

    public CustomComputerBuilder() {
        computer = new Computer();
    }

    public void buildProcessor() {
        System.out.println("Select Processor:");
        int choice = displayOptions(components[0]);
        computer.setProcessor(components[0][choice]);
    }

    public void buildRAM() {
        System.out.println("Select RAM Size:");
        int choice = displayOptions(components[1]);
        computer.setRAM(Integer.parseInt(components[1][choice]));
    }

    public void buildHardDrive() {
        System.out.println("Select Hard Drive:");
        int choice = displayOptions(components[2]);
        computer.setHardDrive(components[2][choice]);
    }

    public void buildGraphicsCard() {
        System.out.println("Select Graphics Card:");
        int choice = displayOptions(components[3]);
        computer.setGraphicsCard(components[3][choice]);
    }

    public void buildOperatingSystem() {
        System.out.println("Select Operating System:");
        int choice = displayOptions(components[4]);
        computer.setOperatingSystem(components[4][choice]);
    }

    private int displayOptions(String[] options) {
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }

        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();

        return (choice - 1);
    }

    public Computer getComputer() {
        return this.computer;
    }
}
