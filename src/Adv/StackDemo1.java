package Adv;

import java.util.Stack;

public class StackDemo1{
  public static void main(String[] args) {
    Stack<String> stack = new Stack<String>();

    stack.push("Hello");
    stack.push("World");

    // Popping elements from the stack.
    String poppedElement1 = stack.pop();
    String poppedElement2 = stack.pop();

    // Printing the popped elements.
    System.out.println(poppedElement1); // World
    System.out.println(poppedElement2); // Hello
  }
}