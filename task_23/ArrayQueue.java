package task_23;

/**
 * Реализация очереди как класса с методами
 * С неявной передачей ссылки на экземпляр (this)
 * Инкапсуляция: все поля приватные, доступ через публичные методы
 */
public class ArrayQueue {
    private Object[] elements;
    private int head;
    private int tail;
    private int size;
    private final int capacity;

    /**
     * Создание очереди с емкостью по умолчанию
     */
    public ArrayQueue() {
        this(10);
    }

    /**
     * Создание очереди с указанной емкостью
     * @param capacity емкость очереди
     */
    public ArrayQueue(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be positive");
        }
        this.capacity = capacity;
        this.elements = new Object[capacity];
        this.head = 0;
        this.tail = 0;
        this.size = 0;
    }

    /**
     * Добавить элемент в очередь
     * Предусловие: очередь не переполнена (size < capacity)
     * Постусловие: size увеличивается на 1, tail перемещается
     */
    public void enqueue(Object element) {
        if (size == capacity) {
            throw new IllegalStateException("Queue is full");
        }
        elements[tail] = element;
        tail = (tail + 1) % capacity;
        size++;
    }

    /**
     * Первый элемент в очереди
     * Предусловие: очередь не пуста (size > 0)
     * Постусловие: возвращает первый элемент, состояние не изменяется
     */
    public Object element() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return elements[head];
    }

    /**
     * Удалить и вернуть первый элемент в очереди
     * Предусловие: очередь не пуста (size > 0)
     * Постусловие: size уменьшается на 1, head перемещается, возвращает первый элемент
     */
    public Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        Object result = elements[head];
        elements[head] = null;
        head = (head + 1) % capacity;
        size--;
        return result;
    }

    /**
     * Текущий размер очереди
     * Предусловие: нет
     * Постусловие: возвращает size, состояние не изменяется
     */
    public int size() {
        return size;
    }

    /**
     * Является ли очередь пустой
     * Предусловие: нет
     * Постусловие: возвращает true если size == 0, иначе false
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Удалить все элементы из очереди
     * Предусловие: нет
     * Постусловие: size = 0, head = 0, tail = 0
     */
    public void clear() {
        for (int i = 0; i < capacity; i++) {
            elements[i] = null;
        }
        head = 0;
        tail = 0;
        size = 0;
    }

}
