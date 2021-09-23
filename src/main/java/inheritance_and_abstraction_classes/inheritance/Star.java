package inheritance_and_abstraction_classes.inheritance;


public class Star extends StarSystem {
    private double r;
    private double l;

    // Getters and setters:
    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    // Class methods:
    public boolean compareRadius(Star compareItem) {
        return this.r > compareItem.r;
    }

    public boolean compareLuminosity(Star compareItem) {
        return this.l > compareItem.l;
    }

    public static void main(String[] args) {
        Star star = new Star();
        // Create Sun:
        star.setR(6.96e8);
        star.setL(3.85e26);

        // Object values:
        System.out.printf("%f %f\n", star.getR(), star.getL());
    }
}
