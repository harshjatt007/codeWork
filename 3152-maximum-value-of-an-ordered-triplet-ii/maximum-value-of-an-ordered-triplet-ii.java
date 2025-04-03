class Solution {
    public long maximumTripletValue(int[] nums) {
         long ans=0,initial_max=0,min_diff=0;
        for(int k=0;k<nums.length;k++){
            ans=Math.max(ans,min_diff*nums[k]);
            initial_max=Math.max(initial_max,nums[k]);
            min_diff=Math.max(min_diff,initial_max-nums[k]);
        }
        return ans;
    }
}