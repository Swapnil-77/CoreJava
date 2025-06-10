package Collection.Map;
// order not guaranteed

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // Adding key-value pairs
        map.put("Apple", 3);
        map.put("Banana", 5);
        map.put("Orange", 2);

        // Printing the map
        System.out.println(map);



        map.put("Pen", 10);
        map.put("Pencil", 5);
        map.put("Eraser", 3);

        // Access a value using key
        System.out.println("Price of Pen: " + map.get("Pen"));

        // Update a value
        map.put("Pen", 15);
        System.out.println("Updated price of Pen: " + map.get("Pen"));

        // Check if key exists
        System.out.println("Has Pencil? " + map.containsKey("Pencil"));


//        map.put("One", 1);
//        map.put("Two", 2);
//        map.put("Three", 3);
//
//        // Remove key
//        map.remove(2);
//
//        // Size of map
//        System.out.println("Size: " + map.size());
//
//        // Final map
//        System.out.println(map);
    }
}
