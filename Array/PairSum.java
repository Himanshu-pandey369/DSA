// return the pairs whose sum is equal to the target in the array which is sorted

public class PairSum {
    boolean Pairsum(int[] nums,int target){
        int i=0,j=nums.length-1;
        while (i<j) {
            if(nums[i]+nums[j]<target){
                i++;
            }
            else if(nums[i]+nums[j]>target){
                j--;
            }
            else{
                System.out.println("Pair found :"+" ["+nums[i]+","+nums[j]+"]");
                return true;
            }
        }
        System.out.println("No pair exists in this array");
        return false;
    }
    public static void main(String[] args) {
        PairSum obj = new PairSum();
        int[] nums = {1,3,5,7,8};
        obj.Pairsum(nums,10);
    }
}
