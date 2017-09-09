package javaex2;

import java.util.ArrayList;
import java.util.List;

public class MyArray {
    public static List<Integer> map(List<Integer> integerList, IntegerMath lambda){
        List<Integer> tempList = new ArrayList<>();

        for (Integer integer : integerList) {
            tempList.add(lambda.h(integer));

        }

        return tempList;
    }
}
