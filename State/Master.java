public class Master extends State {
    public Master(Character character) {
        super(character);
    }

    public void action() {
        System.out.println("====================");
        System.out.println("You are now a Master\n");
        System.exit(0);
    }
}
