package inheritance_and_abstraction_classes.inheritance;

public class Planet extends StarSystem {
    private double s;
    private double v;

    public Planet() {
        // By default we use Earth data:
        this(1.4894e4, 1.08321e12);
    }

    public Planet(double s, double v) {
        this.s = s;
        this.v = v;
    }

    public boolean compareVolume(Planet compareItem) {
        return this.v > compareItem.v;
    }

    public boolean compareSurface(Planet compareItem) {
        return this.s > compareItem.s;
    }
}
