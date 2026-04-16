class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int memo[]=new int[nums.length+1];
        Arrays.fill(memo,-1);
        return robIt(nums,memo,n-1);
    }
    public int robIt(int nums[], int [] memo, int i){
        if(i<0) return 0;
        if(memo[i]!=-1) return memo[i];
        int result= Math.max(robIt(nums,memo,i-2)+nums[i], robIt(nums,memo,i-1));
        memo[i]=result;
        return result;
    }
}