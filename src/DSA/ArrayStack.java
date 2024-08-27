package DSA;

public class ArrayStack<T> {
    private static final int MAX_SIZE = 30;
    private T[] arr;
    private int top;

    @SuppressWarnings("unchecked")
    public ArrayStack() {
        arr = (T[]) new Object[MAX_SIZE];
        top = -1;
    }

    public void push(T val) {
        if (top == MAX_SIZE - 1) {
            throw new IndexOutOfBoundsException("Stack overflow");
        }
        arr[++top] = val;
    }

    public T pop() {
        if (top == -1) {
            throw new IndexOutOfBoundsException("Stack underflow");
        }
        T val = arr[top];
        arr[top--] = null; // Clear the reference to the popped element
        return val;
    }

    public T peek() {
        if (top == -1) {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<>();

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
