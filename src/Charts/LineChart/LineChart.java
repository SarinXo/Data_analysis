package Charts.LineChart;

import Charts.Chart;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class LineChart extends Chart {

    public LineChart(DefaultCategoryDataset dataset,
                     String applicationTitle ,
                     String chartTitle ,
                     String categoryAxisLabel,
                     String categoryAyisLabel,
                     int width, int height) {

        super(applicationTitle);
        JFreeChart lineChart = ChartFactory.createLineChart(
                chartTitle,
                categoryAxisLabel,
                categoryAyisLabel,
                dataset,
                PlotOrientation.VERTICAL,
                true,true,false
        );

        ChartPanel chartPanel = new ChartPanel( lineChart );
        chartPanel.setPreferredSize( new java.awt.Dimension( width , height ) );
        setContentPane( chartPanel );
    }


}
