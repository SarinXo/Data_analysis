package Lab3.Distributions;

public class BernoulliDistribution extends Functions {
    private UniformDistribution uniform = new UniformDistribution();
    private final double p;

    public BernoulliDistribution(double p) {
        super( 0);
        this.p = p;
    }


    public int sample() {
        return uniform.sample() < p ? 1 : 0;
    }
}
