import java.util.Arrays;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivot = n - 2;

        while (pivot >= 0 && nums[pivot] >= nums[pivot + 1]) {
            pivot--;
        }

        if (pivot >= 0) {
            int j = n - 1;
            while (nums[j] <= nums[pivot]) {
                j--;
            }

            int temp = nums[pivot];
            nums[pivot] = nums[j];
            nums[j] = temp;
        }

        int start = pivot + 1;
        int end = n - 1;

        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 5, 4, 3 };
        NextPermutation obj = new NextPermutation();
        obj.nextPermutation(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
