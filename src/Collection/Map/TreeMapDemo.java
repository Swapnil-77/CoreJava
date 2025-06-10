package Collection.Map;
// 🔢 Sorted automatically in alphabetical order (by key)

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();

        map.put("Banana", 3);
        map.put("Apple", 5);
        map.put("Mango", 2);

        System.out.println("TreeMap: " + map);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

//                 📌 Use Cases of TreeMap:
//                    Want sorted view of data
//                    Leaderboard, Student ranking
//                    Auto-sorting dictionary




