package Collection;
//  STACK (LIFO – Last In, First Out)
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Java");
        stack.push("Python");
        stack.push("C");
        stack.push("C++");
        stack.push("Javascript");

        System.out.println(stack);      // [Java, Python, C, C++, JavaScript]

        System.out.println(stack.pop()); // Javascript (removed from top)
        System.out.println(stack.peek()); // C++ (still at top)
        System.out.println(stack.isEmpty()); // false
    }
}
        // push(element) – add to top
        // pop() – remove from top
        // peek() – see the top element
        // isEmpty() – check if stack is empty
