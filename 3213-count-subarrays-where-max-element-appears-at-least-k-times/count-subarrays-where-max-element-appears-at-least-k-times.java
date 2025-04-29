class Solution {
    public long countSubarrays(int[] nums, int k) {
        int n = nums.length;
        int max = 0;

        for (int num : nums) {
            max = Math.max(max, num);
        }

        long count = 0;
        int left = 0;
        int maxCount = 0;

        for (int right = 0; right < n; right++) {
            if (nums[right] == max) {
                maxCount++;
            }

            while (maxCount >= k) {
                count += (n - right);
                if (nums[left] == max) {
                    maxCount--;
                }
                left++;
            }
        }

        return count;
    }
}
