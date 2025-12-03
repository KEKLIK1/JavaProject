package task_23;

public class QueueTest {
    static void main() {
        ArrayQueueModule.enqueue(3);
        ArrayQueueModule.enqueue(1);
        System.out.println(ArrayQueueModule.element());

        ArrayQueueADT arrayQueueADT = new ArrayQueueADT(10);
        ArrayQueueADT.enqueue(arrayQueueADT, 4);
        ArrayQueueADT.enqueue(arrayQueueADT, 5);
        System.out.println(ArrayQueueADT.element(arrayQueueADT));

        ArrayQueue arrayQueue = new ArrayQueue(5);
        arrayQueue.enqueue(7);
        arrayQueue.enqueue(8);
        System.out.println(arrayQueue.element());
    }
}
