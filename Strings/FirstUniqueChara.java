import java.util.*;

public class FirstUniqueChara {

    public static char firstUniqueChar(String str) {
        Map<Character, Integer> freq = new HashMap<>();
        Queue<Character> queue = new LinkedList<>();

        for (char ch : str.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
            queue.offer(ch);

            // Remove non-unique characters from the front
            while (!queue.isEmpty() && freq.get(queue.peek()) > 1) {
                queue.poll();
            }
        }

        return queue.isEmpty() ? '\0' : queue.peek();
    }

    public static void main(String[] args) {
        String str = "swiss";

        char result = firstUniqueChar(str);

        if (result != '\0') {
            System.out.println("First unique character: " + result);
        } else {
            System.out.println("No unique character found");
        }
    }
}