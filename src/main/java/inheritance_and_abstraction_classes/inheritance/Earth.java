package inheritance_and_abstraction_classes.inheritance;

public class Earth extends Planet {
    private String name;
    private double age;

    public Earth() {
        super();
        this.name = "Earth";
    }

    public Earth(String name, double age) {
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
        Earth earth = new Earth("Earth", 4.543e9);
        System.out.println(earth.getPlanetInfo());
    }

}