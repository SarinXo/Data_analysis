package Lab3.Distributions;

import java.util.ArrayList;

public class Binomial extends Functions {
    private int n;
    private double p;
    private BernoulliDistribution bern;

    public Binomial(int count, int n, double p) {
        super( count);
        this.n = n;
        this.p = p;
        this.bern = new BernoulliDistribution(p);
    }

    private double sample() {
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += bern.sample();
        }
        return sum;
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
