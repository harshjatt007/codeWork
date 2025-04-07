class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int totalSum=0;
        for(int i=0;i<nums.length;i++){
            totalSum+=Math.min(nums[i],nums[i+1]);
            i++;
        }
        return totalSum;
    }
}