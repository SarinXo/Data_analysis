package Lab1.Task1L1;

import Lab1.MainTaskL1;
import MyTable.MyTable;

import java.text.DecimalFormat;
import java.util.*;
import java.util.List;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class Task1L1 extends MainTaskL1 {

    private Map<Integer, Integer> statRow= new HashMap<>();

    /**
     * requires that sortedRow must be filled in
     */
    private void initMap(){

        int count = 1;
        for(int i = 0; i< numCount-1; i++){

            if(sortedRow.get(i).equals(sortedRow.get(i + 1))) {
                count++;

            } else {
                statRow.put(sortedRow.get(i), count);
                count = 1;
            }
        }

        if(!statRow.containsKey(sortedRow.get(109)))
            statRow.put(sortedRow.get(109), 1);

    }

    /**
     * input Integer values
     * init (row, sortedRow - super) and statRow
     */
    public Task1L1() {

        super();
        Collections.sort(sortedRow);
        initMap();

        //analog initMap()
        //statRow = sortedRow.stream().collect(
        //        Collectors.groupingBy(
        //                Function.identity(), Collectors.counting()
        //        )
        //);

    }

    private void createTable1(){

        Object[] columns = {"Исходные данные", "Вариационный ряд"};

        JFrame frame = MyTable.frameDefault("Вариационный и статистический ряд", 500, 800);

        DefaultTableModel TModel = new DefaultTableModel(columns, 0);

        for(int i=0 ; i<numCount; i++) {

            Object[] addingRow = {row.get(i), sortedRow.get(i)};
            TModel.addRow(addingRow);
        }

        MyTable.scrollDefault(new JTable(TModel), frame, 400, 800);

    }

    private void createTable2(){

        Object[] columns = {"Элемент", "Частота"};

        JFrame frame = MyTable.frameDefault("Статистический ряд", 500, 800);

        DefaultTableModel TModel = new DefaultTableModel(columns, 0);
        for(var i : statRow.entrySet()) {

            Object[] addingRow = {i.getKey(), i.getValue()};
            TModel.addRow(addingRow);
        }
        MyTable.scrollDefault(new JTable(TModel), frame, 400, 800);

    }

    private void createTable3(){

        Object[] columns = {"Элемент", "Частота", "Процент"};

        JFrame frame = MyTable.frameDefault("Статистический ряд для целых положительных чисел", 500, 800);

        DefaultTableModel TModel = new DefaultTableModel(columns, 0);
        for(var i : statRow.entrySet()) {

            Object[] addingRow = {new DecimalFormat("#0.0000").format((double)i.getKey()),
                                  new DecimalFormat("#0.0000").format((double)i.getValue()),
                                  new DecimalFormat("#0.0000").format((double)i.getValue()/numCount)
            };
            TModel.addRow(addingRow);
        }

        MyTable.scrollDefault(new JTable(TModel), frame, 400, 800);

    }

    @Override
    public void startTask(){

        createTable1();
        createTable2();
        createTable3();
    }
}
