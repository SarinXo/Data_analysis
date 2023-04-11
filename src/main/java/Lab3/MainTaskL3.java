package Lab3;

import Lab1.MainTaskL1;
import Lab1.Task1L1.Task1L1;
import Lab1.Task2L1.Task2L1;
import Lab1.Task3L1.Task3L1;
import Lab3.Distributions.Binomial;
import Lab3.Distributions.Exp;
import Lab3.Distributions.Normal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MainTaskL3 {

    public void startTask(){
        int N, n;
        double p;
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        List<Double> list;

        n = in.nextInt();
        p = in.nextDouble();
        System.out.print("\n\n\n\n\n\n\n\n");
        Binomial bin = new Binomial(N, n, p);
        list = bin.rand();
        MainTaskL1 t1 = new Task1L1(list),
                   t2 = new Task2L1(list),
                   t3 = new Task3L1(list);
        t1.startTask();t2.startTask();t3.startTask();
        ChartCreator.createChart(list);

//        double lambda = in.nextDouble();
//        System.out.print("\n\n\n\n\n\n\n\n");
//        Exp exp = new Exp(N, lambda);
//        list = exp.rand();
//        MainTaskL1 t11 = new Task1L1(list),
//                t22 = new Task2L1(list),
//                t33 = new Task3L1(list);
//        t11.startTask();t22.startTask();t33.startTask();
//        ChartCreator.createChart(list);
//
//
//        double mu = in.nextDouble();
//        double sigma = in.nextDouble();
//        System.out.print("\n\n\n\n\n\n\n\n");
//        Normal normal = new Normal(N, mu, sigma);
//        list = normal.rand();
//        MainTaskL1 t111 = new Task1L1(list),
//                t222 = new Task2L1(list),
//                t333 = new Task3L1(list);
//        t111.startTask();t222.startTask();t333.startTask();
//        ChartCreator.createChart(list);


    }

}
