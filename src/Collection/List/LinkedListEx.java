package Collection.List;
// Ordered, Allows Duplicates
import java.util.LinkedList;

public class LinkedListEx {
        public static void main(String[] args) {
            LinkedList<String> list = new LinkedList<>();
            list.add("One");
            list.add("Two");
            list.add("One"); // duplicate allows

            System.out.println(list);
        }
    }

