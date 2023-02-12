package Charts;

import Charts.LineChart.LineChart;
import org.jfree.chart.ui.ApplicationFrame;
import org.jfree.chart.ui.UIUtils;


public abstract class Chart extends ApplicationFrame {

    public Chart(String applicationTitle){super(applicationTitle);}


    public static void showChart(Chart chart) {
        chart.pack( );
        UIUtils RefineryUtilities = null;
        RefineryUtilities.centerFrameOnScreen( chart );
        chart.setVisible( true );
    }
}
