package Adv;

import java.util.ArrayList;

public class Objects1 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();

        list.add("Hello"); // String
        list.add("World"); // String
        list.add(42); // Integer
        list.add(3.14); // Double
        list.add(true); // Boolean

        // Iterating through the list
        for (Object obj : list) {
            System.out.print(obj + "  ");
        }
        System.out.print("\n");
        for (Object obj : list) {
            if (obj instanceof String) {
                System.out.println("String: " + obj);
            } 
            else if (obj instanceof Integer) {
                System.out.println("Integer: " + obj);
            } 
            else if (obj instanceof Double) {
                System.out.println("Double: " + obj);
            } 
            else if (obj instanceof Boolean) {
                System.out.println("Boolean: " + obj);
            }
        }
    }
}