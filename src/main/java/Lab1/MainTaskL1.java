package Lab1;

import FilesWork.FileChooser;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public abstract class MainTaskL1 {

    protected List<Double> row = new ArrayList<Double>();
    protected int numCount;
    protected List<Double> sortedRow = new ArrayList<Double>();


   /**
   *  init row and sortedRow
   */
    public MainTaskL1() {

        JFileChooser file = FileChooser.openFileDialog();

        if (file.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            try {
                Scanner in = new Scanner(file.getSelectedFile());

                while (in.hasNextInt()) {
                    row.add((double)in.nextInt());
                }

                in.close();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "File not Found", "Error", 3);
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "null", "Error", 3);
            }

        }
        numCount = row.size();
        sortedRow.addAll(row);
        Collections.sort(sortedRow);

    }

    public MainTaskL1(List<Double> p){
        row.addAll(p);
        sortedRow.addAll(p);
        numCount = row.size();
        Collections.sort(sortedRow);
    }

    public void startTask(){
        System.out.print("This metod need to @Override in daughter Classes\n");
    }
}
