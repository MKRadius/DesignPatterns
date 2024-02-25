public class Intermediate extends State {
    public Intermediate(Character character) {
        super(character);
    }

    public void action() {
        String[] options = {"Train (+10 XP)", "Meditate (+10 HP)"};

        System.out.println("=======================");
        System.out.println("You are an Intermediate\n");
        switch (this.getCharacter().readUserChoice(options)) {
            case 1:
                this.getCharacter().addExperiencePoint(10);
                if (this.getCharacter().getExperiencePoint() >= 100) {
                    this.getCharacter().setState(new Expert(this.getCharacter()));
                }

                break;

            case 2:
                if (this.getCharacter().getHealthPoint() < 100) {
                    this.getCharacter().addHealthPoint(10);
                }
                else {
                    System.out.println("You are already at full health\n");
                }

                break;
        }

    }
}
