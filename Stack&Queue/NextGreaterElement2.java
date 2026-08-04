import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement2 {
    public static int[] nextGreaterE(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i % n]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                result[i%n] = -1;
            } else {
                result[i%n] = stack.peek();
            }
            stack.push(arr[i%n]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 6, 5, 4, 2 };

        int[] ans = nextGreaterE(arr);

        System.out.println(Arrays.toString(ans));
    }
}
