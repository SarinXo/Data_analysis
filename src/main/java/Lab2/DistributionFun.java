package Lab2;

import org.apache.commons.math3.analysis.integration.SimpsonIntegrator;

import java.awt.geom.Arc2D;
import java.util.function.*;
public class DistributionFun {

    public static double integrate(double min, double max, Function<Double, Double> f) {
        double result = 0;
        for (double i = min; i < max; i += 0.00001)
            result += f.apply(i) * 0.00001;
        return result;
    }


    private static long factorial(long num){
        if(num == 1 || num == 0)
            return 1;

        return factorial(num-1)*num;
    }

    private static long factorialDifference(long num, long end){
        if(end == num)
            return 1;

        return factorialDifference(num-1, end) * num;
    }

    private static long combinationsWithoutRepetitions(long N, long x){
        return factorialDifference(N, x)/factorial(N-x);
    }

    public static class BinDist {

        public static double Density(int N, double p, int x){

            return combinationsWithoutRepetitions(N, x) * Math.pow(p, x) * Math.pow(1.0 - p, N-x);

        }

    }

    public static class PoissonDist {
        // p = 0.1 - 0.5 and smaller, n - very big num - count of try, m - success count
        public static double distDensity(int n, double p, int m) {
            double summary = Math.pow(Math.E, -1.0 * n * p);
            for (int i = 1; i <= m; i++)
                summary *= n * p / i;

            return summary;
        }

        public static double distFunction(int n, double p, int m) {
            double sum = 0.0;
            for (int i = 0; i <= m; i++)
                sum += distDensity(n, p, i);

            return sum;
        }


    }

    public static class UniformDist {


        public static double distDensity(double a, double b){
            return 1.0/(b-a);

        }
        public static double distFunc(double a, double b, double x){
            return Math.max(0, (x-a)/(b-a));
        }
    }
    public static class ExpDist {

        public static double distDensity(double lambda, double x){
            return Math.max(0, Math.pow(Math.E , (-1.0*x / lambda))/lambda);

        }
        public static double distFunction(double lambda, double x){
            return Math.max(0, 1.0 - Math.pow(Math.E , -1.0*x /lambda ) );
        }
    }



}
