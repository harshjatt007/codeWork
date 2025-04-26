//  Brute-Force 
//class Solution {
//     public long countSubarrays(int[] nums, int minK, int maxK) {
//         int count=0;
//         for(int i=0;i<nums.length;i++){
//             int min=Integer.MAX_VALUE;
//             int max=Integer.MIN_VALUE;
//             for(int j=i;j<nums.length;j++){
//                 if(nums[j]<min) min=nums[j];
//                 if(nums[j]>max) max=nums[j];
//                 if(min==minK && max==maxK) count++;
//             }
//         }
//         return count;
//     }
// }

class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long count=0;
        int start=-1,mini=-1,maxi=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<minK || nums[i]>maxK) start=i;
            if(nums[i]==maxK) maxi=i;
            if(nums[i]==minK) mini=i;
            int valid=Math.max(0,Math.min(maxi,mini)-start);
            count+=valid;
        }
        return count;
    }
}