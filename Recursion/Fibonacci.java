public class Fibonacci {
    public int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) {
        Fibonacci obj = new Fibonacci();
        System.out.println(obj.fib(7));
    }
}