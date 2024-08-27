package Adv;

import java.util.HashMap;

public class HasMap {
  public static void main(String[] args) {

    // Create a HashMap object called people
    HashMap<String, Integer> people = new HashMap<String, Integer>();

    // Add keys and values (Name, Age)
    people.put("John", 32);
    people.put("Steve", 30);
    people.put("Angie", 33);

    for (String i : people.keySet()) {
      System.out.println("key: " + i + " value: " + people.get(i));// Output: key: John value: 32
    }
    System.out.println("size: " + people.size());// Output: size: 3
    System.out.println("isEmpty: " + people.isEmpty());// Output: isEmpty: false
    System.out.println("containsKey: " + people.containsKey("John"));// Output: containsKey: true
    System.out.println("containsValue: " + people.containsValue(32));// Output: containsValue: true
    System.out.println("get: " + people.get("John"));// Output: get: 32
    System.out.println("values: " + people.values());// Output: values: [32, 30, 33]
    System.out.println("keySet: " + people.keySet());// Output: keySet: [John, Steve, Angie]
    System.out.println("remove: " + people.remove("John"));// Output: remove: 32

  }
}
