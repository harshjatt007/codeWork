class Solution {
    public int longestSubarray(int[] nums) {
        int left=0;
        int ans=0;
        int zeros=0;
        int n=nums.length;
        for(int right=0;right<n;right++){
            if(nums[right]==0) zeros++;
            while(zeros>1){
                if(nums[left]==0) zeros--;
                left++;
            }
            ans=Math.max(right-left+1-zeros,ans);
        }
        return ans==n?ans-1:ans;
    }
}