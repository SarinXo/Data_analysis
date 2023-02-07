package Lab1;

import FileChooser.FileChooser;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public abstract class MainTaskL1 {

    protected final int numCount = 110;

    protected List<Integer> row = new ArrayList<Integer>();
    protected List<Integer> sortedRow = new ArrayList<Integer>();



   /**
   *  init row and sortedRow
   */
    public MainTaskL1() {

        JFileChooser file = FileChooser.openFileDialog();

        //start init
        if (file.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            try {
                Scanner in = new Scanner(file.getSelectedFile());

                while (in.hasNextInt()) {
                    row.add(in.nextInt());
                }

                in.close();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "File not Found", "Error", 3);
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "null", "Error", 3);
            }

        }

        sortedRow.addAll(row);
        Collections.sort(sortedRow);

    }

    public void startTask(){
        System.out.print("This metod need to @Override in daughter Classes\n");
    }
}
