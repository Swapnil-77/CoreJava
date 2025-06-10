package Collection.Set;

import java.util.TreeSet;

//  Sorted, No Duplicates
public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(30);
        set.add(10);
        set.add(20);
        set.add(10); // duplicate
        System.out.println(set);
    }
}
    // ✅Sorted automatically (ascending)
