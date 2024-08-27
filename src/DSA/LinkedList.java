package DSA;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {
    Node head;

    class Node {
        T data;
        Node next;

        Node(T val) {
            data = val;
            next = null;
        }
    }

    LinkedList() {
        head = null;
    }

    public void insertAtBeginning(T val) {
        Node newNode = new Node(val);
        // when list is empty
        if (head == null)
            head = newNode;
        else { // list is not empty
            newNode.next = head;
            head = newNode;
        }
    }

    public void display() {
        Node temp = head; // start from head
        while (temp != null) { // null implies end of list
            System.out.print(temp.data + " ");
            temp = temp.next; // jump
        }
    }

    public void insertAtPos(int pos, T val) {
        if (pos == 0) {
            insertAtBeginning(val);
            return;
        }

        Node newNode = new Node(val);
        Node temp = head;
        for (int i = 1; i < pos; i++) { // jump to prev node
            temp = temp.next;
            if (temp == null)
                throw new IndexOutOfBoundsException("Invalid Pos " + pos);
        }

        // reassign pointers
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteAtPos(int pos) {
        if (head == null)
            throw new IndexOutOfBoundsException("Deletion attempted on empty list ");

        if (pos == 0) {
            head = head.next;
            return;
        }

        Node temp = head;
        Node prev = null;

        // jump till node to be deleted
        for (int i = 1; i <= pos; i++) {
            prev = temp; // keep track of prev node
            temp = temp.next; // jump to next node
        }

        prev.next = temp.next; // reassign pointers
    }

    public void deleteAtBeginning() {
        if (head == null)
            throw new IndexOutOfBoundsException("Deletion attempted on empty list ");

        head = head.next;
    }

    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = head.next;

        while (current != null) {
            next = current.next;
            current.next = prev; // reverse link
            prev = current;
            current = next;
        }

        head = prev;
    }

    public T get(int pos) {
        if (head == null || pos < 0)
            throw new IndexOutOfBoundsException("Invalid position " + pos);

        Node temp = head;
        for (int i = 0; i < pos; i++) {
            if (temp == null)
                throw new IndexOutOfBoundsException("Invalid position " + pos);
            temp = temp.next;
        }

        return temp.data;
    }

    public void update(int pos, T val) {
        if (head == null || pos < 0)
            throw new IndexOutOfBoundsException("Invalid position " + pos);

        Node temp = head;
        for (int i = 0; i < pos; i++) {
            if (temp == null)
                throw new IndexOutOfBoundsException("Invalid position " + pos);
            temp = temp.next;
        }

        temp.data = val;
    }

    public void deleteAtEnd() {
        if (head == null)
            throw new IndexOutOfBoundsException("Deletion attempted on empty list ");

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }

    public void insertAtEnd(T val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    public int search(T val) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data.equals(val))
                return index;
            temp = temp.next;
            index++;
        }
        return -1;
    }

    public boolean contains(T val) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.equals(val))
                return true;
            temp = temp.next;
        }
        return false;
    }

    public int length() {
        Node temp = head;
        int len = 0;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        return len;
    }

    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Node temp = head;

            public boolean hasNext() {
                return temp != null;
            }

            public T next() {
                T val = temp.data;
                temp = temp.next;
                return val;
            }
        };
    }
}
