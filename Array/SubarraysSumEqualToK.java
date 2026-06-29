import java.util.*;

public class SubarraysSumEqualToK {
    public static int SubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int num : nums) {

            sum += num;

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
        public static void main(String[] args) {
        int[] nums = {9,4,20,3,10,5};
        int target = 33;

        System.out.println(SubarraySum(nums, target));
    }
}

