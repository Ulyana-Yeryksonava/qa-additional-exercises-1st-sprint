package inheritance_and_abstraction_classes.inheritance;

public class Sirius extends Star {
    private boolean isBrightest;
    private String[] translationFromGreek;
    private char starLetter;

    public Sirius() {
        this.isBrightest = true;
        this.translationFromGreek = new String[]{"glowing", "scorching"};
        this.starLetter = 'A';
    }

    public Sirius(char letter) {
        this.starLetter = letter;
    }

    public String getFirstTranslation() {
        return this.translationFromGreek[0];
    }

    public String getSecondTranslation() {
        return this.translationFromGreek[1];
    }
}
