public class OfficeComputerBuilder implements ComputerBuilder {
    private Computer computer;

    public OfficeComputerBuilder() {
        computer = new Computer();
    }

    public void buildProcessor() {
        computer.setProcessor("Intel Core i5-12600");
    }

    public void buildRAM() {
        computer.setRAM(16);
    }

    public void buildHardDrive() {
        computer.setHardDrive("512GB SSD");
    }

    public void buildGraphicsCard() {
        computer.setGraphicsCard("Integrated Graphics");
    }

    public void buildOperatingSystem() {
        computer.setOperatingSystem("Windows 11 Enterprise");
    }

    public Computer getComputer() {
        return this.computer;
    }
}
