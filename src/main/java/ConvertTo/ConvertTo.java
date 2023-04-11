package ConvertTo;

import java.util.List;

public class ConvertTo {

    public static Object[][] listToArrObjTable(List<Object[]> dataList){
        Object[][] dataArray = new Object[dataList.size()][];

        for(int i = 0 ; i< dataList.size(); i++)
            dataArray[i] = dataList.get(i);

        return dataArray;
    }

}
