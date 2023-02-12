package Lab2;

import MyTable.MyTable;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class UnivariateDistributions {

    public void binDistributions(final int MaxParam){

        String[] columns = {"Значение", "Плотность распределения", "Функция распределения"};

        JFrame frame = MyTable.frameDefault("Распределение Пуассона", 500, 800);

        DefaultTableModel TModel = new DefaultTableModel(columns, 0);
       //for(int i=0; i< MaxParam; i++) {

       //    Object[] addingRow = {i,  };
       //    TModel.addRow(addingRow);
       //}

        MyTable.scrollDefault(new JTable(TModel), frame, 400, 800);

    }

    void startTask(){


    }

}
