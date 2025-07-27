class Solution {
    public long maximumMedianSum(int[] nums) {
        int n=nums.length;
        long ans=0;
        int cnt=0;
        Arrays.sort(nums);
        int i=0;
        int j=n-1;
        int k=j-1;
        while(cnt++<n/3)
            {
                ans+=nums[k];
                k-=2;
                j-=2;
                i+=2;
            }
        return ans;
    }
}