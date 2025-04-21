// class Solution {
//     public int maxSubarraySumCircular(int[] nums) {
//     int currentMax=nums[0];
//     int n=nums.length;
//     int max=nums[0];
//      for(int i=1;i<n+1;i++){
//         currentMax=Math.max((currentMax+nums[i%n]),nums[i%n]);
//         if(i==n-2 && currentMax<nums[0]+nums[n-1]) {currentMax=nums[0]+nums[n-1]; max=Math.max(currentMax,max); break;}
//         max=Math.max(max,currentMax);
//      }
//      return max;   
//     }
// }

class Solution {  
    public int maxSubarraySumCircular(int[] nums) {  
        int total = 0;  
        int maxSum = nums[0];  
        int currentMax = 0;  
        int minSum = nums[0];  
        int currentMin = 0;  
        
        for (int num : nums) {  
            currentMax = Math.max(currentMax + num, num);  
            maxSum = Math.max(maxSum, currentMax);  
            
            currentMin = Math.min(currentMin + num, num);  
            minSum = Math.min(minSum, currentMin);  
            
            total += num;  
        }  
        
        return maxSum > 0 ? Math.max(maxSum, total - minSum) : maxSum;  
    }  
}  