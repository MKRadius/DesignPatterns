public class Main {
    public static void main(String[] args) {
        ComputerBuilder builder = new GamingComputerBuilder();
        Director director = new Director(builder);
        director.constructComputer();
        Computer computer = builder.getComputer();
        System.out.println(computer);

        builder = new OfficeComputerBuilder();
        director = new Director(builder);
        director.constructComputer();
        computer = builder.getComputer();
        System.out.println(computer);

        builder = new CustomComputerBuilder();
        director = new Director(builder);
        director.constructComputer();
        computer = builder.getComputer();
        System.out.println(computer);
    }
}