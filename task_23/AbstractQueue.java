package task_23;

/**
 * Абстрактный базовый класс для реализаций очереди
 * Содержит общую логику и поля, которые используются в различных реализациях
 */

public abstract class AbstractQueue {
    public abstract void enqueue(int element);
    public abstract int element();
    public abstract void dequeue();
    public abstract int size();
    public abstract boolean isEmpty();
    public abstract void clear();
}