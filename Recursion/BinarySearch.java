class BinarySearch {
    int binSearch(int[] arr, int tar, int st, int end) {
        int mid = st + (end - st) / 2;
        if (st <= end) {
            if (arr[mid] == tar) {
                return mid;
            } else if (arr[mid] <= tar) {
                return binSearch(arr, tar, mid + 1, end);
            } else {
                return binSearch(arr, tar, st, mid - 1);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch obj = new BinarySearch();
        int[] nums = { 12, 23, 55, 23 };
        System.out.println(obj.binSearch(nums, 23, 0, nums.length - 1));
    }
}