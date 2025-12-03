package task_23;


// Node Class
class Node {
    int data;
    Node next;

    // Constructor
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Queue Class
class LinkQueue implements Queue {
    Node front, rear;
    int length;

    // Constructor
    public LinkQueue() {
        this.front = this.rear = null;
        this.length=0;
    }



    @Override
    public void enqueue(int key) {
        this.length++;
        Node temp = new Node(key);

        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }

        this.rear.next = temp;
        this.rear = temp;
    }

    @Override
    public int element() {
        if (this.front != null)
            return this.front.data;

        // Return Exception
        return Integer.MIN_VALUE;
    }

    @Override
    public void dequeue() {
        if (this.front == null)
            throw new IllegalStateException("Queue is empty");

        Node temp = this.front;
        this.front = this.front.next;

        // If Queue is Empty
        if (this.front == null)
            this.rear = null;

        // Removing the Front Element
        temp.next = null;
    }

    @Override
    public int size(){
        return this.length;
    }


    @Override
    public boolean isEmpty() {
        return this.length == 0;
    }

    @Override
    public void clear() {
        Node temp = this.front;
        for(int i = 0; i < this.length; i++){
            temp.next = null;
        }
        this.front = this.rear = null;
        this.length=0;
    }

    // Printing the Elements of Queue
    void printQueue(){
        Node temp=this.front;

        System.out.print("Element of Queue : ");

        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}

// Driver Class
public class LinkedQueue {
    // Main Function
    public static void main(String[] args) {
        LinkQueue q = new LinkQueue();
        q.enqueue(10);
        q.enqueue(20);

        q.printQueue();
        System.out.println("Size :" + q.size());
        q.clear();
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.printQueue();
        System.out.println("Size :" + q.size());
        System.out.println("Front item is: " + q.element());
    }
}
