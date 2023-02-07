package Lab1.Task3L1;


import Charts.BarChart.BarChart;
import Charts.LineChart.LineChart;
import Lab1.Task2L1.Task2L1;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import java.util.List;

public class Task3L1 extends Task2L1 {

    private final List<Double[]> Data = getData();

    public Task3L1(){
        super();
    }

    private DefaultCategoryDataset createDataset( int indexValueData, String rowKey, int indexColumnKey) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset( );

        Double[] str = new Double[7];
        for(var row : Data) {
            int i =0;
            for(var variable : row){
                str[i] = variable;
                i++;
            }

            dataset.addValue( str[indexValueData] , rowKey , str[indexColumnKey] );
        }

        return dataset;
    }

    private LineChart[] createPolygons(){
        return new LineChart[]{
                new LineChart(              //frequencyPolygon
                        createDataset(3, "Расенган", 2),
                "Нарута",
                "Полигон частот",
                "Интервалы",
                "Кол-во чисел в интервале",
                500, 400
                ),
                new LineChart(              //frequencyCountPolygon
                        createDataset(4, "Шаренган", 2),
                        "Саске",
                        "Полигон накопленных частот",
                        "Интервалы",
                        "Кол-во чисел",
                        500, 400
                ),
                new LineChart(              //frequencyPolygon
                        createDataset(5, "Смэрть", 2),
                        "Мадара",
                        "Полигон относительных частот",
                        "Интервалы",
                        "Процент",
                        500, 400
                )

        };

    }

    private BarChart[] createHistogram(){
        return new BarChart[]{
                new BarChart(              //frequencyPolygon
                        createDataset(3, "Расенган", 2),
                        "Нарута",
                        "Полигон частот",
                        "Интервалы",
                        "Кол-во чисел в интервале",
                        500, 400
                ),
                new BarChart(              //frequencyCountPolygon
                        createDataset(4, "Шаренган", 2),
                        "Саске",
                        "Полигон накопленных частот",
                        "Интервалы",
                        "Кол-во чисел",
                        500, 400
                ),
                new BarChart(              //frequencyPolygon
                        createDataset(5, "Смэрть", 2),
                        "Мадара",
                        "Полигон относительных частот",
                        "Интервалы",
                        "Процент",
                        500, 400
                )

        };



    }
    @Override
    public void startTask(){
        LineChart[] Lch = createPolygons();
        for(var i : Lch)
            LineChart.showChart(i);

        BarChart[] Bch = createHistogram();
        for(var i : Bch)
            BarChart.showChart(i);
    }

}
