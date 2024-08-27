package DSA;

public class QueueUsingLL {
    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    Node front, rear;

    QueueUsingLL() {
        front = null;
        rear = null;
    }

    public void enqueue(int val) { // O(1)
        Node newNode = new Node(val);
        if (front == null)
            front = newNode;
        else
            rear.next = newNode;
        rear = newNode;
    }

    public int dequeue() { // O(1)
        if (front == null) // no node in Q
            throw new IndexOutOfBoundsException("Queue is Empty");
        int temp = front.data;
        front = front.next;
        if (front == null) // deleted last node and now Q is empty
            rear = null;
        return temp;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int elementAtFront() {
        if (front == null) // no node in Q
            throw new IndexOutOfBoundsException("Queue is Empty");
        return front.data;
    }

    public static void main(String[] args) {
        QueueUsingLL queue = new QueueUsingLL();

        System.out.println("Enqueuing elements into the queue:");
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Element at the front of the queue: " + queue.elementAtFront());

        System.out.println("Dequeuing elements from the queue:");
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        System.out.println("Is the queue empty? " + queue.isEmpty());

        System.out.println("Dequeuing remaining element from the queue:");
        System.out.println(queue.dequeue());

        System.out.println("Is the queue empty now? " + queue.isEmpty());

        // Trying to dequeue from an empty queue (will throw exception)
        // queue.dequeue();
    }
}
