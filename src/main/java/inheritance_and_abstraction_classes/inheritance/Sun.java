package inheritance_and_abstraction_classes.inheritance;

public class Sun extends Star {
    private int temperature;
    private double distanceFromAnotherPlanet;

    public Sun() {
        super.setR(6.96e8);
        super.setL(3.85e26);;
        this.temperature = 5778;  // K
        this.distanceFromAnotherPlanet = 150.1e6;
    }

    public Sun(int temperature, double distanceFromAnotherPlanet) {
        this.temperature = temperature;
        this.distanceFromAnotherPlanet = distanceFromAnotherPlanet;
    }

    public void printInfo() {
        System.out.println(
                "R: " + super.getR() + ", " +
                "L: " + super.getL() + ", " +
               "Planet temperature: " + this.temperature + "K"
        );
    }

    public static void main(String[] args) {
        Sun sun = new Sun();
        sun.printInfo();
    }
}
