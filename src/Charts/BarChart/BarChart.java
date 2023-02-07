package Charts.BarChart;

import Charts.Chart;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import java.nio.charset.CharacterCodingException;

public class BarChart extends Chart {

    public BarChart(DefaultCategoryDataset dataset,
                    String applicationTitle ,
                    String chartTitle,
                    String categoryAxisLabel,
                    String categoryAyisLabel,
                    int width, int height) {

        super( applicationTitle );
        JFreeChart barChart = ChartFactory.createBarChart(
                chartTitle,
                categoryAxisLabel,
                categoryAyisLabel,
                dataset,
                PlotOrientation.VERTICAL,
                true, true, false);

        ChartPanel chartPanel = new ChartPanel( barChart );
        chartPanel.setPreferredSize(new java.awt.Dimension( width , height ) );
        setContentPane( chartPanel );
    }


}
