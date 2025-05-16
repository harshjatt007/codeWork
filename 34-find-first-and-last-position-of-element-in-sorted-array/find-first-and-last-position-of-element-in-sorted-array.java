class Solution {
    public int[] searchRange(int[] nums, int target) {
    int first=-1,second=-1;
    for(int i=0;i<nums.length;i++){
        if(nums[i]==target){
            if(first==-1){
            first=i;}
            second=i;
        }
    }
    return new int[]{first,second};
    }
}