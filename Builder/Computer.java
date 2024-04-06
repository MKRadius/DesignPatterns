public class Computer {
    private String cpu;
    private int ram;
    private String hardDrive;
    private String gpu;
    private String os;

    public Computer() {}

    public void setProcessor(String cpu) {
        this.cpu = cpu;
    }

    public void setRAM(int ram) {
        this.ram = ram;
    }

    public void setHardDrive(String hardDrive) {
        this.hardDrive = hardDrive;
    }

    public void setGraphicsCard(String gpu) {
        this.gpu = gpu;
    }

    public void setOperatingSystem(String os) {
        this.os = os;
    } 

    @Override
    public String toString() {
        return "PC:\n" + 
            "CPU: " + cpu + "\n" +
            "RAM: " + ram + "GB\n" +
            "Hard Drive: " + hardDrive + "\n" +
            "GPU: " + gpu + "\n" +
            "OS: " + os + "\n";
    }
}