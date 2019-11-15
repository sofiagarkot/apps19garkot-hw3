package ua.edu.ucu.smartarr;
import java.util.ArrayList;
import java.util.Arrays;
public class BaseArray implements SmartArray{

    private ArrayList arr;
    public BaseArray(Object[] arr){ this.arr = new ArrayList<>(Arrays.asList(arr)); }

    @Override
    public Object[] toArray() {
        return this.arr.toArray();
    }

    @Override
    public String operationDescription() {
        return this.arr.toString();
    }

    @Override
    public int size() {
        return this.arr.size();
    }
}
