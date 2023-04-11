package MyTable;

import org.jfree.chart.ChartFrame;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class MyTable{

    public static JFrame frameDefault(String title, int width, int height){

        JFrame frame = new JFrame(title);
        frame.setSize(width, height);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        return frame;
    }

    public static void scrollDefault(JTable table, JFrame frame, int width, int height){

        JScrollPane scroll = new JScrollPane(table);
        table.setPreferredScrollableViewportSize(new Dimension(width, height));
        frame.getContentPane().add(scroll);
        frame.setVisible(true);
    }
    public void createTable(Object[][] data, String[] namesColumns, String title, int width, int height){

        //String[] columns = {"Значение", "Плотность распределения", "Функция распределения"};

        JFrame frame = MyTable.frameDefault(title, width, height);

        DefaultTableModel TModel = new DefaultTableModel(data, namesColumns);

        MyTable.scrollDefault(new JTable(TModel), frame, width, width);

    }

}
