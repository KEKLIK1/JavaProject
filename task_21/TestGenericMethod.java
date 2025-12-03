package task_21;

import java.util.Arrays;

public class TestGenericMethod<T>{
    private T[] array;

    public TestGenericMethod(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public T getElement(int i){
        return array[i];
    }

    @Override
    public String toString() {
        return "TestGenericMethod{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}