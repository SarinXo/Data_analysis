package Charts.BarChart;

import Charts.Chart;
import Charts.ChartPattern;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import java.nio.charset.CharacterCodingException;

public class BarChart extends ChartPattern {

    public BarChart(DefaultCategoryDataset dataset,
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

        return  ChartFactory.createBarChart(
                    chartTitle,
                    categoryAxisLabel,
                    categoryAyisLabel,
                    dataset,
                    PlotOrientation.VERTICAL,
                    true,false,false
        );

    }

}
