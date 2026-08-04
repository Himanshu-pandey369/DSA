import java.util.Arrays;
import java.util.Stack;

public class PreviousSmaller {
    public static int[] previousSmaller(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <= n-1; i++) {
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 0, 8, 6 };

        int[] ans = previousSmaller(arr);

        System.out.println(Arrays.toString(ans));
    }
}
