package MyTable;

import javax.swing.*;
import java.awt.*;

public class MyTable{

    public static JFrame frameDefault(String title, int width, int height){

        JFrame frame = new JFrame(title);
        frame.getContentPane().setLayout(new FlowLayout());
        frame.setSize(width, height);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return frame;
    }

    public static void scrollDefault(JTable table, JFrame frame, int width, int height){

        JScrollPane scroll = new JScrollPane(table);
        table.setPreferredScrollableViewportSize(new Dimension(width, height));
        frame.getContentPane().add(scroll);
        frame.setVisible(true);

    }

}
