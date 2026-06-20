import java.util.*;
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {     
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {   
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int [] nums ={ 1,3,6,4,7};
        TwoSum obj = new TwoSum();
        int [] ans = obj.twoSum(nums, 10);
        System.out.println(Arrays.toString(ans));
    }

}
