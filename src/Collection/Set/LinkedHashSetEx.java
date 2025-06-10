package Collection.Set;
// keeps insertion order

import java.util.LinkedHashSet;

public class LinkedHashSetEx {
    public static void main(String[] args) {
        LinkedHashSet<String>set = new LinkedHashSet<>();
        set.add("Cat");
        set.add("Dog");
        set.add("Cat");  // duplicates not allows
        set.add("Monkey");
        set.add("Tiger");
        System.out.println(set);
    }
}
    //✅ LinkedHashSet = Remembers the order you inserted the items.
