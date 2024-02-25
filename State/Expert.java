public class Expert extends State {
    public Expert(Character character) {
        super(character);
    }

    public void action() {
        String[] options = {"Fight (+20 XP, -10 HP)", "Train (+10 XP)", "Meditate (+20 HP)"};

        System.out.println("=================");
        System.out.println("You are an Expert\n");
        switch (this.getCharacter().readUserChoice(options)) {
            case 1:
                this.getCharacter().addExperiencePoint(20);
                if (this.getCharacter().getExperiencePoint() >= 300) {
                    this.getCharacter().setState(new Master(this.getCharacter()));
                }

                this.getCharacter().addHealthPoint(-10);
                if (this.getCharacter().getHealthPoint() <= 0) {
                    System.out.println("You are dead\n");
                    System.exit(0);
                }

                break;

            case 2:
                this.getCharacter().addExperiencePoint(10);
                if (this.getCharacter().getExperiencePoint() >= 300) {
                    this.getCharacter().setState(new Master(this.getCharacter()));
                }

                break;

            case 3:
                if (this.getCharacter().getHealthPoint() < 100) {
                    this.getCharacter().addHealthPoint(20);
                }
                else {
                    System.out.println("You are already at full health\n");
                }

                break;
        }

    }
}
