package Collection.Set;
//  Unordered, No Duplicates
import java.util.HashSet;

public class HashSetEx {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Cat");
        set.add("Dog");
        set.add("Cat");  // duplicates not allows
        set.add("Monkey");
        set.add("Tiger");
        System.out.println(set);
    }
}
      // ✅HashSet (does NOT maintain insertion order):
