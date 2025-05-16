class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start=0,end=nums.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(mid%2==1) mid--; // make mid even to align (mid,mid+1);
            if(nums[mid]!=nums[mid+1]) end=mid; // left me hain single element
            else start+=2; // pair is right
        }
        return nums[start];
    }
}