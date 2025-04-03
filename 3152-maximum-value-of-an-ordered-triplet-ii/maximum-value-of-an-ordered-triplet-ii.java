class Solution {
    public long maximumTripletValue(int[] nums) {
        int n=nums.length;
        int leftMax[]=new int[n];
        int rightMax[]=new int[n];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(leftMax[i-1],nums[i-1]);
            rightMax[n-i-1]=Math.max(rightMax[n-i],nums[n-i]);
        }
        long result=0;
        for(int j=1;j<n-1;j++){
            result=Math.max(result,((long)(leftMax[j]-nums[j])*rightMax[j]));
        }
        return result;
    }
}