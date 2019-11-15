package ua.edu.ucu.smartarr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;


public class DistinctDecorator extends SmartArrayDecorator {

    private ArrayList newArr;
    public DistinctDecorator(SmartArray smartArray) {
        super(smartArray);
        this.newArr = (ArrayList) Arrays.asList(this.smartArray.toArray()).stream().distinct().collect(Collectors.toList());
    }

    @Override
    public Object[] toArray() {
        return this.newArr.toArray();
    }

    @Override
    public String operationDescription() {
        return "Removing duplicates"+this.newArr.toString();
    }

    @Override
    public int size() {
        return this.newArr.size();
    }
}
