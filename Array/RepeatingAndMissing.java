import java.util.HashMap;

public class RepeatingAndMissing {
        void findMissingAndDuplicate(int[] nums) {        
        HashMap<Integer, Integer> map = new HashMap<>();
        int duplicate = -1;
        int missing = -1;
        int n = nums.length;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int i = 1; i <= n; i++) {
            if (map.containsKey(i)) {
                if (map.get(i) > 1) {
                    duplicate = i;
                }
            } else {
                missing = i;
            }
        }

        System.out.println("Duplicate: " + duplicate);
        System.out.println("Missing: " + missing);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};
        RepeatingAndMissing obj = new RepeatingAndMissing();
        obj.findMissingAndDuplicate(nums);
    }
}
