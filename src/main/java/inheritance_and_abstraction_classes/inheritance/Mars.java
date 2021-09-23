package inheritance_and_abstraction_classes.inheritance;

public class Mars extends Planet {
    private String name;
    private double age;

    public Mars() {
        super(144.37e6, 1.63118e11);
        this.name = "Mars";
    }

    public Mars(String name, double age) {
        super(144.37e6, 1.63118e11);
        this.name = name;
        this.age = age;
    }

    public long convertPlanetAge() {
        return (long) this.age;
    }

    public String getPlanetInfo() {
        return "Planet info. "
                + "1) " + this.name + ", "
                + "2) " + convertPlanetAge() + " y/o.";
    }

    public static void main(String[] args) {
        Mars mars = new Mars("Mars", 4.603e9);
        System.out.println(mars.getPlanetInfo());
    }
}
