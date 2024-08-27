package DSA;

public class QueueUsingArrays {
    static final int MAX_SIZE = 30;
    int arr[];
    int front, rear;

    QueueUsingArrays() {
        arr = new int[MAX_SIZE];
        front = -1;
        rear = -1;
    }

    public void enqueue(int val) { // O(1)
        if (rear == MAX_SIZE - 1)
            throw new IndexOutOfBoundsException("Queue is Full");
        if (front == -1)
            front++;
        arr[++rear] = val;

    }

    public int dequeue() { // O(1)
        if (front == -1 || front > rear)
            throw new IndexOutOfBoundsException("Queue is Empty");
        return arr[front++];
    }

    public static void main(String[] args) {
        QueueUsingArrays queue = new QueueUsingArrays();

        System.out.println("Enqueuing elements into the queue:");
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Dequeuing elements from the queue:");
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        queue.enqueue(40);

        System.out.println("Dequeuing remaining elements from the queue:");
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        // Trying to dequeue from an empty queue (will throw exception)
        // queue.dequeue();
    }
}
