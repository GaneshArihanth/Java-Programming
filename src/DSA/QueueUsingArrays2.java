package DSA;

public class QueueUsingArrays2 {
    static final int MAX_SIZE = 30;
    int arr[];
    int rear;

    QueueUsingArrays2() {
        arr = new int[MAX_SIZE];
        rear = -1;
    }

    public void enqueue(int val) { // O(1)
        if (rear == MAX_SIZE - 1)
            throw new IndexOutOfBoundsException("Queue is Full");

        arr[++rear] = val;
    }

    public int dequeue() { // O(n)
        if (rear == -1)
            throw new IndexOutOfBoundsException("Queue is Empty");
        int temp = arr[0];

        for (int i = 1; i <= rear; i++)
            arr[i - 1] = arr[i];

        rear--;
        return temp;
    }

    public static void main(String[] args) {
        QueueUsingArrays2 queue = new QueueUsingArrays2();

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
