package Lab1.Task3L1;


import Charts.BarChart.BarChart;
import Charts.LineChart.LineChart;
import Lab1.Task2L1.Task2L1;
import javafx.util.Pair;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Task3L1 extends Task2L1 {

    private final List<Double[]> Data = getData();

    public Task3L1(){
        super();
        initMap();
    }

    public Task3L1(List<Double> list){
        super(list);
        initMap();
    }

    private Map<Double, Integer> statRow= new LinkedHashMap<>();

    /**
     * requires that sortedRow must be filled in
     */
    private void initMap(){

        int count = 1;
        for(int i = 0; i< numCount-1; i++){

            if(sortedRow.get(i).equals(sortedRow.get(i + 1))) {
                count++;

            } else {
                statRow.put(sortedRow.get(i), count);
                count = 1;
            }
        }

        if(!statRow.containsKey(sortedRow.get(sortedRow.size()-1)))
            statRow.put(sortedRow.get(sortedRow.size()-1), 1);

    }

    private DefaultCategoryDataset createDataset( int indexValueData, String rowKey, int indexColumnKey) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset( );

        Integer[] str = new Integer[7];
        for(var row : Data) {
            int i =0;
            for(var variable : row){
                str[i] = variable.intValue();
                i++;
            }

            dataset.addValue( str[indexValueData] , rowKey , str[indexColumnKey] );
        }

        return dataset;
    }

    private DefaultCategoryDataset createDataset2( int indexValueData, String rowKey, int indexColumnKey) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset( );


        for(var row : statRow.entrySet()) {
            Pair<Double, Integer> pair = new Pair<>(row.getKey(), row.getValue());


        }

        return dataset;
    }

    private LineChart[] createPolygons(){
        return new LineChart[]{
                new LineChart(              //frequencyPolygon
                        createDataset(3, " ", 2),
                "Linechart",
                "Полигон частот",
                "Интервалы",
                "Кол-во чисел в интервале",
                500, 400
                ),
                new LineChart(              //frequencyCountPolygon
                        createDataset(4, " ", 2),
                        "Linechart",
                        "Полигон накопленных частот",
                        "Интервалы",
                        "Кол-во чисел",
                        500, 400
                ),
                new LineChart(              //frequencyPolygon
                        createDataset(5, " ", 2),
                        "Linechart",
                        "Полигон относительных частот",
                        "Интервалы",
                        "Процент",
                        500, 400
                ),
                new LineChart(              //frequencyPolygon
                        createDataset(6, " ", 2),
                        "Linechart",
                        "Относительная накопленная частота",
                        "Интервалы",
                        "Процент",
                        500, 400
                )

        };

    }

    private BarChart[] createHistogram(){
        return new BarChart[]{
                new BarChart(              //frequencyPolygon
                        createDataset(3, " ", 2),
                        "BarChart",
                        "Полигон частот",
                        "Интервалы",
                        "Кол-во чисел в интервале",
                        500, 400
                ),
                new BarChart(              //frequencyCountPolygon
                        createDataset(4, " ", 2),
                        "BarChart",
                        "Полигон накопленных частот",
                        "Интервалы",
                        "Кол-во чисел",
                        500, 400
                ),
                new BarChart(              //frequencyPolygon
                        createDataset(5, " ", 2),
                        "BarChart",
                        "Полигон относительных частот",
                        "Интервалы",
                        "Процент",
                        500, 400
                ),
                new BarChart(              //frequencyPolygon
                        createDataset(6, " ", 2),
                        "BarChart",
                        "Относительная накопленная частота",
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
