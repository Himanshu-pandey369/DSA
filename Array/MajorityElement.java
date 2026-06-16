class MajorityElement {
    public int majorityElement(int[] nums) {
        int i, freq=0,ans=0;
        for(i=0;i<nums.length;i++){
            if(freq == 0){
                ans = nums[i];
            }
            if(ans == nums[i]){
                freq++;
            }
            else{
                freq--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        MajorityElement obj = new MajorityElement();
        int[] nums = {1,2,2,5,5,2,5};
        int result = obj.majorityElement(nums);
        System.out.println(result);
    }
}