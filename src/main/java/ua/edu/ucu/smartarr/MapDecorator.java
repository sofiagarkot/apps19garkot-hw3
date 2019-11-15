package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class MapDecorator  extends SmartArrayDecorator{

    private ArrayList newArr;

    public MapDecorator(SmartArray smartArray, MyFunction myfunc){
        super(smartArray);
        this.newArr = (ArrayList) Arrays.asList(this.smartArray.toArray()).stream().map((a)->myfunc.apply(a)).collect(Collectors.toList());

    }

    @Override
    public Object[] toArray() {
        return this.newArr.toArray();
    }

    @Override
    public String operationDescription() {
        return "Mapping to each element function MyFunc"+this.newArr.toString();
    }

    @Override
    public int size() {
        return this.newArr.size();
    }
}
