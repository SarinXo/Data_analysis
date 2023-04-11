package Charts.LineChart;

import Charts.Chart;
import Charts.ChartPattern;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class LineChart extends ChartPattern {

    public LineChart(DefaultCategoryDataset dataset,
                    String applicationTitle ,
                    String chartTitle,
                    String categoryAxisLabel,
                    String categoryAyisLabel,
                    int width, int height) {

        super(dataset, applicationTitle , chartTitle, categoryAxisLabel, categoryAyisLabel, width,  height);

    }

    @Override
    public JFreeChart chartType(String chartTitle,
                                String categoryAxisLabel,
                                String categoryAyisLabel,
                                DefaultCategoryDataset dataset){

        return  ChartFactory.createLineChart(
                chartTitle,
                categoryAxisLabel,
                categoryAyisLabel,
                dataset,
                PlotOrientation.VERTICAL,
                true,false,false
        );

    }




}
