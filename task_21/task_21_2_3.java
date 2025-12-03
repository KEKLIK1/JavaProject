package task_21;

public class task_21_2_3 {
    static void main() {
        Integer[] integers = {1, 2, 3};
        TestGenericMethod intArray = new TestGenericMethod<>(integers);
        System.out.println(intArray);
        System.out.println(intArray.getElement(2));

        String[] strings = {"Wert", "qweq", "aswq"};
        TestGenericMethod strArray = new TestGenericMethod<>(strings);
        System.out.println(strArray);
        System.out.println(strArray.getElement(2));
    }
}
