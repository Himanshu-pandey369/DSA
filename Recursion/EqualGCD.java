class EqualGCD {

    static final int MOD = 1_000_000_007;

    Long[][][] memo;
    int[] nums;

    public int subsequencePairCount(int[] nums) {
        this.nums = nums;

        int max = 0;
        for (int x : nums) {
            max = Math.max(max, x);
        }

        // memo[index][gcd1][gcd2]
        memo = new Long[nums.length + 1][max + 1][max + 1];

        return (int) dfs(0, 0, 0);
    }

    private long dfs(int index, int gcd1, int gcd2) {

        // Base case
        if (index == nums.length) {
            if (gcd1 != 0 && gcd2 != 0 && gcd1 == gcd2) {
                return 1;
            }
            return 0;
        }

        // If already computed, return stored answer
        if (memo[index][gcd1][gcd2] != null) {
            return memo[index][gcd1][gcd2];
        }

        // Choice 1: Put current number in first subsequence
        long first = dfs(index + 1,
                         gcd(gcd1, nums[index]),
                         gcd2);

        // Choice 2: Put current number in second subsequence
        long second = dfs(index + 1,
                          gcd1,
                          gcd(gcd2, nums[index]));

        // Choice 3: Skip current number
        long skip = dfs(index + 1,
                        gcd1,
                        gcd2);

        long ans = (first + second + skip) % MOD;

        // Store the answer
        memo[index][gcd1][gcd2] = ans;

        return ans;
    }

    private int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }
}