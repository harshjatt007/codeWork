class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<=1) return nums.length;
        Arrays.sort(nums);
        int count=1;
        int maxCount=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                count++;
            }
            else if(nums[i]==nums[i-1]){
                maxCount=Math.max(count,maxCount);
                continue;
            }
            else count=1;
            maxCount=Math.max(count,maxCount);
        }
        return maxCount;
    }
}