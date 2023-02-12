package Lab2;

public class DistributionFunctions{

    private long factorial(long num){
        if(num == 1 || num == 0)
            return 1;

        return factorial(num-1)*num;
    }
    private long factorialDifference(long num, long end){
        if(end == num)
            return 1;

        return factorialDifference(num-1, end) * num;
    }

    private long combinationsWithoutRepetitions(long N, long x){
        return factorialDifference(N, x)/factorial(N-x);
    }


    public class BinomialDistribution {

        public double distributionDensity(int N, double p, int x){

            return combinationsWithoutRepetitions(N, x) * Math.pow(p, x) * Math.pow(1.0 - p, N-x);

        }
        //public double distributionFunction(double){  it's simple Sum. I don't need this func
//
        //
        //}
    }
    public class PoissonDistribution  {
        // n = 0.1 - 0.5 and smaller
        public double distributionDensity(){


        }
        public double distributionFunction(){


        }
    }
    public class UniformDistribution  {

        public double distributionDensity(){


        }
        public double distributionFunction(){


        }
    }
    public class ExponentialDistribution  {

        public double distributionDensity(){


        }
        public double distributionFunction(){


        }
    }
    public class NormalDistribution   {

        public double distributionDensity(){


        }
        public double distributionFunction(){


        }
    }
    public class X2distribution   {

        public double distributionDensity(){


        }
        public double distributionFunction(){


        }
    }
    public class StudentDistribution  {

        public double distributionDensity(){


        }
        public double distributionFunction(){


        }
    }
    public class FisherDistribution  {

        public double distributionDensity(){


        }
        public double distributionFunction(){


        }
    }
}
