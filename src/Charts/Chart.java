package Charts;

import Charts.LineChart.LineChart;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

public abstract class Chart extends ApplicationFrame {

    public Chart(String applicationTitle){super(applicationTitle);}


    public static void showChart(Chart chart) {
        chart.pack( );
        RefineryUtilities.centerFrameOnScreen( chart );
        chart.setVisible( true );
    }
}
