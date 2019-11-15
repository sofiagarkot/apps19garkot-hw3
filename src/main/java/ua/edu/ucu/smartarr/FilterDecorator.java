package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyPredicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class FilterDecorator extends SmartArrayDecorator {

    private ArrayList newArr;
    private MyPredicate filterPredicate;

    public FilterDecorator(SmartArray smartArray, MyPredicate myPredicate) {
        super(smartArray);
        this.filterPredicate = myPredicate;
        this.newArr = new ArrayList<>(Arrays.asList(this.smartArray.toArray()).stream().filter((a) -> filterPredicate.test(a)).collect(Collectors.toList()));
    }

    @Override
    public Object[] toArray() {
        return this.newArr.toArray();
    }

    @Override
    public String operationDescription() {
        return "Filtering using MyPredicate"+this.newArr.toString();
    }

    @Override
    public int size() {
        return this.newArr.size();
    }
}
