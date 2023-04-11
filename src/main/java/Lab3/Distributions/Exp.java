package Lab3.Distributions;

import java.util.ArrayList;

public class Exp extends Functions {
    private UniformDistribution uniform = new UniformDistribution();
    private double lambda;

    public Exp(int count, double lambda) {
        super( count);
        this.lambda = lambda;
    }

    public double sample() {
        return -Math.log(uniform.sample()) / lambda;
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
