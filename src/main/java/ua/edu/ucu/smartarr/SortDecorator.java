package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortDecorator extends SmartArrayDecorator {

    private ArrayList<Object> newArr;
    public SortDecorator(SmartArray smartArray, MyComparator comparator){
        super(smartArray);
        this.newArr = new ArrayList<> (Arrays.asList(this.smartArray.toArray()));
        Collections.sort(this.newArr, comparator);
    }

    @Override
    public Object[] toArray() {
        return this.newArr.toArray();
    }

    @Override
    public String operationDescription() {
        return "Sorted array using MyComparator"+this.newArr.toString();
    }

    @Override
    public int size() {
        return this.newArr.size();
    }
}
