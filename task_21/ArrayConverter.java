import java.util.Arrays;
import java.util.List;

public static class ArrayConverter {
    public static <T> List<T> convertArrayToList(T[] array) {
        return Arrays.asList(array);
    }
}

static void main() {
    String[] stringArray = {"Hello", "World", "Java"};
    List<String> stringList = ArrayConverter.convertArrayToList(stringArray);
    System.out.println("String list: " + stringList);

    Integer[] numberArray = {1, 2, 3, 4, 5};
    List<Integer> numberList = ArrayConverter.convertArrayToList(numberArray);
    System.out.println("Number list: " + numberList);

}