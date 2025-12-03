package task_23;
/**
 * ИНВАРИАНТ ОЧЕРЕДИ:
 * 1. 0 <= size <= capacity
 * 2. 0 <= head < capacity
 * 3. 0 <= tail < capacity
 * 4. size = (tail >= head) ? (tail - head) : (capacity - head + tail)
 * 5. Элементы хранятся в порядке добавления: [head], [head+1], ..., [tail-1]
 * 6. Очередь пуста когда head == tail && size == 0
 * 7. Очередь полна когда head == tail && size == capacity
 */


/**
 * Реализация очереди как модуля с одним экземпляром
 * Использует переменные класса для хранения состояния
 * Инкапсуляция: все поля приватные, доступ только через методы
 */
public class ArrayQueueModule {
    private static final int DEFAULT_CAPACITY = 10;
    private static Object[] elements;
    private static int head;
    private static int tail;
    private static int size;

    // Статический блок инициализации
    static {
        elements = new Object[DEFAULT_CAPACITY];
        head = 0;
        tail = 0;
        size = 0;
    }

    private ArrayQueueModule() {
        // Приватный конструктор - нельзя создавать экземпляры
    }

    /**
     * Добавить элемент в очередь
     * Предусловие: очередь не переполнена (size < capacity)
     * Постусловие: size увеличивается на 1, tail перемещается
     */
    public static void enqueue(Object element) {
        if (size == elements.length) {
            throw new IllegalStateException("Queue is full");
        }
        elements[tail] = element;
        tail = (tail + 1) % elements.length;
        size++;
    }

    /**
     * Первый элемент в очереди
     * Предусловие: очередь не пуста (size > 0)
     * Постусловие: возвращает первый элемент, состояние не изменяется
     */
    public static Object element() {
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
    public static Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        Object result = elements[head];
        elements[head] = null; // Помощь сборщику мусора
        head = (head + 1) % elements.length;
        size--;
        return result;
    }

    /**
     * Текущий размер очереди
     * Предусловие: нет
     * Постусловие: возвращает size, состояние не изменяется
     */
    public static int size() {
        return size;
    }

    /**
     * Является ли очередь пустой
     * Предусловие: нет
     * Постусловие: возвращает true если size == 0, иначе false
     */
    public static boolean isEmpty() {
        return size == 0;
    }

    /**
     * Удалить все элементы из очереди
     * Предусловие: нет
     * Постусловие: size = 0, head = 0, tail = 0
     */
    public static void clear() {
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
        head = 0;
        tail = 0;
        size = 0;
    }

}
