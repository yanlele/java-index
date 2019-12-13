package demo3;

public class CircleException extends Exception {
    private double radius;

    public CircleException(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Custom exception:radius:r=" + radius +
                ",needs to be a positive number.";
    }
}
g
