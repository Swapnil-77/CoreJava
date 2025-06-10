package Collection.List;
// Ordered, Allows Duplicates

import java.util.ArrayList;

public class ArrayListEX {
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple");  // duplicates allows
        System.out.println(list);

    }
}


