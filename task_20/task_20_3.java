package task_20;

import java.io.Serializable;

// Базовый класс Animal
class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animal{name='" + name + "'}";
    }
}



// Обобщенный класс с ограничениями
public class task_20_3<T extends Comparable<T>, V extends Animal & Serializable, K> {
    private T first;
    private V second;
    private K third;

    // Конструктор
    public task_20_3(T first, V second, K third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    // Геттеры
    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public K getThird() {
        return third;
    }

    // Метод для вывода имен классов
    public void printClassNames() {
        System.out.println("Тип T: " + first.getClass().getSimpleName());
        System.out.println("Тип V: " + second.getClass().getSimpleName());
        System.out.println("Тип K: " + third.getClass().getSimpleName());
    }

    @Override
    public String toString() {
        return String.format("Triple{first=%s, second=%s, third=%s}",
                first, second, third);
    }
}