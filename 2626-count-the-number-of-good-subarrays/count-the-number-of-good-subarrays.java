// class Solution {
//     public long countGood(int[] nums, int k) {
//         Map<Integer, Integer> mpp = new HashMap<>();
//         long cnt = 0; int left = 0;
//         for (int i = 0; i < nums.length; i++) {
//             k -= mpp.getOrDefault(nums[i], 0);
//             mpp.put(nums[i], mpp.getOrDefault(nums[i], 0) + 1);
//             while (k <= 0) {
//                 mpp.put(nums[left], mpp.get(nums[left]) - 1);
//                 k += mpp.get(nums[left++]);
//             }
//             cnt += left;
//         }
//         return cnt;
//     }
// }

class Solution {  
    public long countGood(int[] nums, int k) {  
        int n = nums.length;  
        int left = 0, right = 0;  
        long goodSubarrays = 0;  
        Map<Integer, Integer> freq = new HashMap<>();  
        long equalPairs = 0;  

        while (left < n) {  
            // Expand right pointer while we don't have enough pairs  
            while (right < n && equalPairs < k) {  
                int num = nums[right];  
                int count = freq.getOrDefault(num, 0);  
                equalPairs += count;  // Adding count means new pairs formed with this num  
                freq.put(num, count + 1);  
                right++;  
            }  

            // If current window has at least k pairs, add remaining subarrays  
            if (equalPairs >= k) {  
                goodSubarrays += n - right + 1;  
            }  

            // Shrink from left, update pairs and freq  
            int leftNum = nums[left];  
            int count = freq.get(leftNum);  
            freq.put(leftNum, count - 1);  
            equalPairs -= count - 1;  // Removing pairs associated with leftNum  
            left++;  
        }  

        return goodSubarrays;  
    }  
}  