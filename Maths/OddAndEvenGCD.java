class OddAndEvenGCD {

    private static int GCD(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    public static int gcdOfOddEvenSums(int n) {
        int sumOdd = n * n;
        int sumEven = n * (n + 1);
        return GCD(sumOdd, sumEven);
    }

    public static void main(String[] args) {
        int ans = OddAndEvenGCD.gcdOfOddEvenSums(6);
        System.out.println(ans);
    }
}