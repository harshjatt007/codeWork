class Solution {
    public int digitSum(int num){
        int sum=num;
        int result=0;
        while(sum!=0){
            int digit=sum%10;
            result+=digit;
            sum/=10;
        }
        return result;
    }
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(digitSum(nums[i])<min){
                min=digitSum(nums[i]);
            }
        }
        return min;
    }
}