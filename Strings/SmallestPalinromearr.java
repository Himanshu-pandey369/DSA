import java.util.Arrays;

public class SmallestPalinromearr {
    public static void main(String[] args) {
        String s = "babad";
        int n = s.length();
        String left = s.substring(0, n / 2);
        char[] arr = left.toCharArray();
        Arrays.sort(arr);
        left = new String(arr);
        String right = new StringBuilder(left).reverse().toString();
        String ans;
        if (n % 2 == 0) {
            ans = left + right;
        } else {
            ans = left + s.charAt(n / 2) + right;
        }

        System.out.println(ans);
    }
}