package task_23;


/**
 * Реализация очереди как абстрактного типа данных
 * С явной передачей ссылки на экземпляр очереди
 * Инкапсуляция: все поля приватные, состояние передается явно
 */
public class ArrayQueueADT {
    private Object[] elements;
    private int head;
    private int tail;
    private int size;
    private final int capacity;

    /**
     * Создание новой очереди
     */
    public ArrayQueueADT(int capacity) {
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
    public static void enqueue(ArrayQueueADT queue, Object element) {
        if (queue.size == queue.capacity) {
            throw new IllegalStateException("Queue is full");
        }
        queue.elements[queue.tail] = element;
        queue.tail = (queue.tail + 1) % queue.capacity;
        queue.size++;
    }

    /**
     * Первый элемент в очереди
     * Предусловие: очередь не пуста (size > 0)
     * Постусловие: возвращает первый элемент, состояние не изменяется
     */
    public static Object element(ArrayQueueADT queue) {
        if (isEmpty(queue)) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.elements[queue.head];
    }

    /**
     * Удалить и вернуть первый элемент в очереди
     * Предусловие: очередь не пуста (size > 0)
     * Постусловие: size уменьшается на 1, head перемещается, возвращает первый элемент
     */
    public static Object dequeue(ArrayQueueADT queue) {
        if (isEmpty(queue)) {
            throw new IllegalStateException("Queue is empty");
        }
        Object result = queue.elements[queue.head];
        queue.elements[queue.head] = null;
        queue.head = (queue.head + 1) % queue.capacity;
        queue.size--;
        return result;
    }

    /**
     * Текущий размер очереди
     * Предусловие: нет
     * Постусловие: возвращает size, состояние не изменяется
     */
    public static int size(ArrayQueueADT queue) {
        return queue.size;
    }

    /**
     * Является ли очередь пустой
     * Предусловие: нет
     * Постусловие: возвращает true если size == 0, иначе false
     */
    public static boolean isEmpty(ArrayQueueADT queue) {
        return queue.size == 0;
    }

    /**
     * Удалить все элементы из очереди
     * Предусловие: нет
     * Постусловие: size = 0, head = 0, tail = 0
     */
    public static void clear(ArrayQueueADT queue) {
        for (int i = 0; i < queue.capacity; i++) {
            queue.elements[i] = null;
        }
        queue.head = 0;
        queue.tail = 0;
        queue.size = 0;
    }
}