public class Novice extends State {
    public Novice(Character character) {
        super(character);
    }

    public void action() {
        String[] options = {"Train (+10 XP)"};

        System.out.println("================");
        System.out.println("You are a novice\n");
        switch (this.getCharacter().readUserChoice(options)) {
            case 1:
                this.getCharacter().addExperiencePoint(10);
                if (this.getCharacter().getExperiencePoint() >= 50) {
                    this.getCharacter().setState(new Intermediate(this.getCharacter()));
                }
                break;
        }

    }
}
