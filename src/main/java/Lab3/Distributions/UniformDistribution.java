package Lab3.Distributions;

import java.util.Random;

public class UniformDistribution extends Functions {
    public double a;
    public double b;

    private Random random = new Random();

    public UniformDistribution(double a, double b) {
        super( 0);
        this.a = a;
        this.b = b;
    }

    public UniformDistribution() {
        this(0, 1);
    }

    public double sample() {
        return a + (b - a) * random.nextDouble();
    }
}
