package Collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Alice");
        queue.offer("Bob");
        queue.offer("Charlie");

        System.out.println(queue);       // [Alice, Bob, Charlie]

        System.out.println(queue.poll()); // Alice (removed from front)
        System.out.println(queue.peek()); // Bob (front now)
        System.out.println(queue.isEmpty()); // false
    }
}
        // offer(element) – add to end
        // poll() – remove from front
        // peek() – see front element
        // isEmpty() – check if queue is empty