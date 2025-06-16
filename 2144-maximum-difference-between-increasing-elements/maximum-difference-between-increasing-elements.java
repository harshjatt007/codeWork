class Solution {
    public int maximumDifference(int[] nums) {
        if(nums.length==0) return 0;
        int maxDiff=-1;
        int decrease=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<decrease) decrease=nums[i];
            else if(decrease!=nums[i]) maxDiff=Math.max(nums[i]-decrease,maxDiff);
        }
        return maxDiff;
    }
}