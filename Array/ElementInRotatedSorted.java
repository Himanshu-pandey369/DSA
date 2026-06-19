public class ElementInRotatedSorted {

    int solution(int[] nums) {
        int n = nums.length;
        int st = 0, end = n - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (mid == 0) {
                if (n == 1 || nums[mid] != nums[mid + 1]) {
                    return nums[mid];
                }
                st = mid + 1;
                continue;
            }

            if (mid == n - 1) {
                if (nums[mid] != nums[mid - 1]) {
                    return nums[mid];
                }
                end = mid - 1;
                continue;
            }

            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }

            if (mid % 2 == 0) {
                if (nums[mid] == nums[mid + 1]) {
                    st = mid + 2;
                } else {
                    end = mid - 2;
                }
            } else {
                if (nums[mid] == nums[mid - 1]) {
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        ElementInRotatedSorted obj = new ElementInRotatedSorted();
        int[] nums = { 4, 4, 6, 6, 1, 1, 2, 3, 3 };
        int a = obj.solution(nums);
        System.out.println(a);
    }
}