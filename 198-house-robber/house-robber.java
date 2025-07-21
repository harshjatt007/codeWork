class Solution {
    public int rob(int[] nums) {
        int memo[]=new int[nums.length+1];
        Arrays.fill(memo,-1);
        return rob(nums,memo,nums.length-1);
    }
    public int rob(int []nums,int memo[],int i){
        if(i<0) return 0;
        if(memo[i]!=-1) return memo[i];
        int result=Math.max(rob(nums,memo,i-2)+nums[i],rob(nums,memo,i-1));
        memo[i]=result;
        return result;
    }
}