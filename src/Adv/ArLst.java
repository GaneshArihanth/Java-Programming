package Adv;

import java.util.ArrayList;

public class ArLst {
    public static void main(String[] args) {
        // Creating an ArrayList of strings
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        // Using String.join() to concatenate elements with a delimiter
        String resultJoin = String.join(" ", list);
        System.out.println("Using String.join(): " + resultJoin); // Output: "Hello World"

        // Using toString() to get the string representation of the ArrayList
        String resultToString = list.toString();// Output: "[Hello, World]"
        System.out.println("Using toString(): " + resultToString); // Output: "[Hello, World]"
        System.out.println(list.add("!")); // Output: true

    }
}
