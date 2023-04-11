package Lab1.Task2L1;

import Lab1.MainTaskL1;
import MyTable.MyTable;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Task2L1 extends MainTaskL1 {

    //The result in the Sturgess formula (interval count)
    private final int k = (int)Math.round(1 +3.32 * Math.log10(numCount));

    //interval length
    private final double h = ((double)(sortedRow.get(numCount-1) - sortedRow.get(0))/k);

    public Task2L1(){
        super();
    }

    public Task2L1(List<Double> list){
        super(list);
    }
    protected List<Double[]> getData(){

        List<Double[]> Data = new ArrayList<>();

        double minRange = sortedRow.get(0);
        double periodicity = 0.0;
        double bankPeriodicity=0;
        double bankRelativeFrequency = 0.0;

        for (int ind = 0; ind< numCount;) {

            while (ind < numCount) {
                if (sortedRow.get(ind) <= minRange + h) {
                    periodicity++;
                    ind++;
                } else {
                    break;
                }
            }

            bankPeriodicity += periodicity;
            double relativeFrequency = periodicity / numCount;
            bankRelativeFrequency += relativeFrequency;

            Data.add(new Double[]{
                            minRange,
                            (minRange + h),
                            (((minRange * 2) + h) / 2),
                            periodicity,
                            bankPeriodicity,
                            relativeFrequency,
                            bankRelativeFrequency
                    }
            );
            minRange += h;
            periodicity = 0.0;    //new DecimalFormat("#0.0000").format();
        }

        return Data;
    }
    private void addDataInTable(DefaultTableModel TModel){

        List<Double[]> Data= getData();
        Object[] str = new Object[8];
        int num = 1;
        for(var row : Data) {
            int i = 1;
            str[0] = num;

            for(var varaible : row){
                str[i] = new DecimalFormat("#0.0000").format(varaible);
                i++;
            }

            num++;
            TModel.addRow(str);
        }

}
    private void createTable(){

        Object[] columns = {"№",
                            "Нижняя граница",
                            "Верхняя граница",
                            "Середина",
                            "Частота",
                            "Накопленная частота",
                            "Относительная частота",
                            "Относительнпя накопленная частота"
        };

        JFrame frame = MyTable.frameDefault("Задание 2", 1000, 300);

        DefaultTableModel TModel = new DefaultTableModel(columns, 0);

        addDataInTable(TModel);

        MyTable.scrollDefault(new JTable(TModel), frame, 950, 300);
    }

    @Override
    public void startTask() {
        createTable();
    }
}
