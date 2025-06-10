package Collection.Map;
// Maintains insertion order
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();

        map.put("Java", 90);
        map.put("Python", 85);
        map.put("C++", 75);

        System.out.println("LinkedHashMap: " + map);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());

//            map.containsKey("Python");  // true
//            map.containsValue(85);      // true
//            map.remove("C++");          // removes entry
//            map.size();                 // returns size
        }
    }
}

//                   ✅ Key Features:
//                      *Maintains insertion order
//                      *Allows one null key and multiple null values
//                      *Performance is slightly slower than HashMap
//                       because it maintains a linked listinternally