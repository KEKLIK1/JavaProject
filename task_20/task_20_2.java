package task_20;

public class task_20_2 <T, V, K> {
    private T first;
    private V second;
    private K third;

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public V getSecond() {
        return second;
    }

    public void setSecond(V second) {
        this.second = second;
    }

    public K getThird() {
        return third;
    }

    public void setThird(K third) {
        this.third = third;
    }

    public void printClassNames() {
        System.out.println("Тип T: " + first.getClass().getSimpleName());
        System.out.println("Тип V: " + second.getClass().getSimpleName());
        System.out.println("Тип K: " + third.getClass().getSimpleName());
    }
}
