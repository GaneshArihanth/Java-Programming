package DSA;

public class StackUsingLinkedList<T> {
    class Node {
        T data;
        Node next;

        Node(T val) {
            data = val;
            next = null;
        }
    }

    Node top;

    StackUsingLinkedList() {
        top = null;
    }

    public void push(T val) {
        Node newNode = new Node(val);
        newNode.next = top;
        top = newNode;
    }

    public T pop() {
        if (top == null)
            throw new IndexOutOfBoundsException("Stack is Empty");

        T tmp = top.data;
        top = top.next;
        return tmp;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public T peek() {
        if (top == null)
            throw new IndexOutOfBoundsException("Stack is Empty");

        return top.data;
    }

    public static void main(String[] args) {
        StackUsingLinkedList<Integer> stack = new StackUsingLinkedList<>();

        System.out.println("Pushing elements onto the stack:");
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Peek element: " + stack.peek());

        System.out.println("Popping elements from the stack:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        // Trying to pop from an empty stack (will throw exception)
        // stack.pop();
    }
}
