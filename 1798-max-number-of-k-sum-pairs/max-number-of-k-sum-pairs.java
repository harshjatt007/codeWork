class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        int maxOperations=0;
        while(i<j){
            if(nums[i]+nums[j]==k){
             maxOperations++;
             i++;j--;
            }
            if(nums[i]+nums[j]>k){
                j--;
            } 
            if(nums[i]+nums[j]<k){
                i++;
            }

        }
        return maxOperations;
    }
}