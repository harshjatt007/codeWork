class Solution {
    public int findMaxK(int[] nums) {
       HashSet<Integer>set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int maxNumber=-1;
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i]) && set.contains(-nums[i]) && maxNumber<Math.abs(nums[i])) maxNumber=Math.abs(nums[i]);
        }
        return maxNumber;
    }
}