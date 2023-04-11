package Charts;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public abstract class ChartPattern  extends Chart{

    public ChartPattern(DefaultCategoryDataset dataset,
                     String applicationTitle,
                     String chartTitle,
                     String categoryAxisLabel,
                     String categoryAyisLabel,
                     int width, int height) {

        super(applicationTitle);

        JFreeChart Chart = chartType(chartTitle, categoryAxisLabel, categoryAyisLabel, dataset);

        ChartPanel chartPanel = new ChartPanel( Chart );
        chartPanel.setPreferredSize( new java.awt.Dimension( width , height ) );
        setContentPane( chartPanel );
    }

    abstract public JFreeChart chartType(String chartTitle,
                                         String categoryAxisLabel,
                                         String categoryAyisLabel,
                                         DefaultCategoryDataset dataset);

}
