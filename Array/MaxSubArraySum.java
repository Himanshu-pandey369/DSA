package Array;

class MaxSubArraySum {
    int maxSubArray(int[] nums){
        int i,maxSum=Integer.MIN_VALUE,currentSum=0; 
        for(i=0;i<nums.length;i++){
            currentSum+=nums[i];
            maxSum=Math.max(maxSum, currentSum);
            if(currentSum<0){
                currentSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        MaxSubArraySum obj = new MaxSubArraySum();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = obj.maxSubArray(nums);
        System.out.println("Maximum Sub-Array Sum: " + result);
    }
}

