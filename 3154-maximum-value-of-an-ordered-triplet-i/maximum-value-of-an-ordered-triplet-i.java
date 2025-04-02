class Solution {
    public long maximumTripletValue(int[] nums) {
        long maxVal = 0;
        int n = nums.length;
        
        for (int j = 1; j < n - 1; j++) {
            long maxBefore = Integer.MIN_VALUE;
            for (int i = 0; i < j; i++) {
                maxBefore = Math.max(maxBefore, nums[i]);
            }
            
            long maxAfter = Integer.MIN_VALUE;
            for (int k = j + 1; k < n; k++) {
                maxAfter = Math.max(maxAfter, nums[k]);
            }
            
            long currentVal = (maxBefore - nums[j]) * maxAfter;
            
            if (currentVal > maxVal) {
                maxVal = currentVal;
            }
        }
        
        return maxVal < 0 ? 0 : maxVal;
    }
}