class Solution {
    public boolean search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target) return true;
            if(nums[left]==nums[mid] && nums[mid]==nums[right]){
                left++; right--;
            } 
            // left part sorted hain
            else if (nums[left]<=nums[mid]){
                if(nums[left]<=target && target<nums[mid]){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
            // right part is sorted 
            else{
                if(nums[mid]<target && target<=nums[right]){
                    left=mid+1;
                }
                else right=mid-1;
            }
        }
        return false;
    }
}


// class Solution {
//     public boolean search(int[] nums, int target) {
//         // O (N)
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]==target) return true;
//         }
//         return false;
//     }
// }