public class SearchRotatedSort {
    int Search(int[] nums, int target) {
        int st = 0, end = nums.length - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (nums[mid] == target) {
                System.out.println("element present");
                return mid;
            }
            if (nums[st] <= nums[mid]) {
                if (nums[st] <= target && target <= nums[mid]) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            } else {
                if (nums[mid] <= target && target <= nums[end]) {
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
     public static void main(String[] args) {
        SearchRotatedSort obj = new SearchRotatedSort();
        int[] nums = {4,5,6,7,1,3};
        obj.Search(nums,6);
    }
}
