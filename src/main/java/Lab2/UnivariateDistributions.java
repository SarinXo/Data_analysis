package Lab2;

import ConvertTo.ConvertTo;
import MyTable.MyTable;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static java.lang.System.out;

public class UnivariateDistributions {
    Scanner in = new Scanner(System.in);
    public void createTable(Object[][] data, String title, int width, int height){

        String[] columns = {"Значение", "Плотность распределения", "Функция распределения"};

        JFrame frame = MyTable.frameDefault(title, 500, 800);

        DefaultTableModel TModel = new DefaultTableModel(data, columns);

        MyTable.scrollDefault(new JTable(TModel), frame, width, height);

    }
    public void bin(){

        out.print("Введите параметр N>0 : ");
        int N = in.nextInt();
        out.print("\n");
        out.print("Введите параметр p = [0, 1] : ");
        double p = in.nextDouble();
        out.print("\n");

        double sum = 0.0;
        List<Object[]> dataList = new ArrayList<>();

        for(int i=0; i <= N; i++) {

            sum += DistributionFun.BinDist.Density(N, p, i);
            Object[] addingRow = {i, new DecimalFormat("#0.0000").format(DistributionFun.BinDist.Density(N, p, i)),
                    new DecimalFormat("#0.0000").format(sum)};
            dataList.add(addingRow);
        }

        createTable(ConvertTo.listToArrObjTable(dataList), "Bin", 400, 400);
    }

    public void poisson(){


        out.print("Введите кол-во испытаний : ");
        int N = in.nextInt();
        out.print("\n");
        out.print("Введите вероятность p = [0, 1] : ");
        double p = in.nextDouble();
        out.print("\n");
        out.print("Введите кол-во шагов : ");
        int m = in.nextInt();
        out.print("\n");

        List<Object[]> dataList = new ArrayList<>();

        for(int i=0; i <= m; i+=2) {

            Object[] addingRow = {i, new DecimalFormat("#0.0000").format(DistributionFun.PoissonDist.distDensity(N, p, i)),
                    new DecimalFormat("#0.0000").format(DistributionFun.PoissonDist.distFunction(N, p, i))};
            dataList.add(addingRow);
        }

        createTable(ConvertTo.listToArrObjTable(dataList), "poisson", 400, 400);
    }

    public void uniform(){

        out.print("Введите нижнюю границу : ");
        double a = in.nextInt();
        out.print("\n");
        out.print("Введите верхнюю границу : ");
        double b = in.nextDouble();
        out.print("\n");
        out.print("Введите шаг : ");
        double iteration = in.nextInt();
        out.print("\n");

        List<Object[]> dataList = new ArrayList<>();

        for(double i=0; i <=b; i+=iteration) {

            Object[] addingRow = {i,
                    new DecimalFormat("#0.0000").format(DistributionFun.UniformDist.distDensity(a, b)),
                    new DecimalFormat("#0.0000").format(DistributionFun.UniformDist.distFunc(a, b, i))};

            dataList.add(addingRow);
        }

        createTable(ConvertTo.listToArrObjTable(dataList), "uniform", 400, 400);
    }

    public void exp(){

        out.print("Введите нижнюю границу : ");
        double a = in.nextInt();
        out.print("\n");
        out.print("Введите верхнюю границу : ");
        double b = in.nextDouble();
        out.print("\n");
        out.print("Введите шаг : ");
        double iteration = in.nextInt();
        out.print("\n");
        out.print("Введите lambda : ");
        double lambda = in.nextInt();
        out.print("\n");

        List<Object[]> dataList = new ArrayList<>();

        for(double i=a; i <=b; i+=iteration) {

            Object[] addingRow = {i,
                    new DecimalFormat("#0.0000").format(DistributionFun.ExpDist.distDensity(lambda, i)),
                    new DecimalFormat("#0.0000").format(DistributionFun.ExpDist.distFunction(lambda,i))};

            dataList.add(addingRow);
        }

        createTable(ConvertTo.listToArrObjTable(dataList), "uniform", 400, 400);
    }


    public void startTask(){
        poisson();
        uniform();
        exp();

    }

}
