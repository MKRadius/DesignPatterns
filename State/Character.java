import java.util.Scanner;

public class Character {
    private Scanner scanner = new Scanner(System.in);

    private String name;
    private int level;
    private int experiencePoint;
    private int healthPoint;
    private State state;

    public Character(String name) {
        this.name = name;
        this.level = 1;
        this.experiencePoint = 0;
        this.healthPoint = 100;
        this.state = new Novice(this);
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getExperiencePoint() {
        return experiencePoint;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public String getStateName() {
        return this.state.getClass().getSimpleName();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void addExperiencePoint(int experiencePoint) {
        this.experiencePoint += experiencePoint;
    }

    public void addHealthPoint(int healthPoint) {
        this.healthPoint += healthPoint;
    }

    public void play() {
        while (true) {
            if (this.state != null) {
                this.state.action();
            }
            else System.out.println("Can't create a state\n");
        }
    }

    public void printCharacterStats() {
        System.out.println("Name: " + this.getName());
        System.out.println("Level: " + this.getLevel());
        System.out.println("Experience Point: " + this.getExperiencePoint());
        System.out.println("Health Point: " + this.getHealthPoint());
        System.out.println("State: " + this.getStateName());
    }

    public int readUserChoice(String[] options) {
        this.printCharacterStats();

        System.out.println("\nOptions:");
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
        System.out.print("\nSelect an option: ");

        return scanner.nextInt();
    }
}
