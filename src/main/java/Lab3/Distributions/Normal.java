package Lab3.Distributions;

import java.util.ArrayList;

public class Normal extends Functions {
    private UniformDistribution uniform = new UniformDistribution();
    private final Exp expdist;
    private final double mu;
    private final double sigma;

    public Normal(int count, double mu, double sigma) {
        super(count);
        this.mu = mu;
        this.sigma = sigma;
        this.expdist = new Exp(count, sigma);
    }

    private double sample() {
        double u;
        double e;
        do {
            u = uniform.sample();
            e = expdist.sample();
        } while (!(u < Math.exp(-Math.pow(e - 1, 2))));
        u = uniform.sample();
        return e * (u < 0.5 ? -1 : 1);
    }

    @Override
    public ArrayList<Double> rand() {

        ArrayList<Double> ans = new ArrayList<>();
        for(int i = 0; i < count; i++){
            ans.add(sample());
        }
        return ans;
    }

}
