class Solution {
    public int numSubseq(int[] nums, int target) {
        int mod=1_000_000_007;  
        int n=nums.length; 
        Arrays.sort(nums);
        int power[]=new int[n];
        power[0]=1;
        for(int i=1;i<nums.length;i++){
            power[i]=(power[i-1]*2)%mod;
        }
        int start=0,end=n-1,result=0;
        while(start<=end){
            if(nums[start]+nums[end]<=target){
                result=(result+power[end-start])%mod;
                start++;
            }
            else end--;
        }
        return result;
    }
}