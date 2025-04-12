class Solution {
    public int findPeakElement(int[] nums) {
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]>nums[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
}

// if(nums[mid]>nums[start] && nums[mid]>nums[end]){
            //     return mid+1;
            // }
            // if(nums[mid]>nums[start]) start=mid;
            // if(nums[mid]>nums[end]) end=mid;