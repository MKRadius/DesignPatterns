public class GamingComputerBuilder implements ComputerBuilder {
    private Computer computer;

    public GamingComputerBuilder() {
        computer = new Computer();
    }

    public void buildProcessor() {
        computer.setProcessor("Intel Core i7-14700K");
    }

    public void buildRAM() {
        computer.setRAM(32);
    }

    public void buildHardDrive() {
        computer.setHardDrive("1TB SSD");
    }

    public void buildGraphicsCard() {
        computer.setGraphicsCard("Nvidia RTX 4090");
    }

    public void buildOperatingSystem() {
        computer.setOperatingSystem("Windows 11 Pro");
    }

    public Computer getComputer() {
        return this.computer;
    }
}
