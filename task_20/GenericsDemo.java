package task_20;

public class GenericsDemo {
    public static void main(String[] args) {

        Integer[] intArray = {5, 2, 8, 1, 9, 3};
        MinMax<Integer> intMinMax = new MinMax<>(intArray);
        System.out.println("Минимальный элемент: " + intMinMax.findMin());
        System.out.println("Максимальный элемент: " + intMinMax.findMax());


        String[] strArray = {"яблоко", "бан", "вишня", "арбуз"};
        MinMax<String> strMinMax = new MinMax<>(strArray);
        System.out.println("Минимальный элемент: " + strMinMax.findMin());
        System.out.println("Максимальный элемент: " + strMinMax.findMax());


        Double[] doubleArray = {3.14, 2.71, 1.41, 0.57};
        MinMax<Double> doubleMinMax = new MinMax<>(doubleArray);
        System.out.println("Минимальный элемент: " + doubleMinMax.findMin());
        System.out.println("Максимальный элемент: " + doubleMinMax.findMax());


        Integer a = 10;
        Double b = 3.5;

        System.out.println("Сложение: " + a + " + " + b + " = " + Calculator.sum(a, b));
        System.out.println("Умножение: " + a + " * " + b + " = " + Calculator.multiply(a, b));
        System.out.println("Деление: " + a + " / " + b + " = " + Calculator.divide(a, b));
        System.out.println("Вычитание: " + a + " - " + b + " = " + Calculator.subtraction(a, b));

    }
}