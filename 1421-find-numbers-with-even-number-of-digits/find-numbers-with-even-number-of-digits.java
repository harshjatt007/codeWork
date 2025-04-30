class Solution {
    public int findNumbers(int[] nums) {
        int countEven=0;
       for(int i=0;i<nums.length;i++){
        int num=nums[i];
        int noOfDigits=0;
        while(num!=0){
            num/=10;
            noOfDigits++;
        }
        if(noOfDigits%2==0) countEven++;
       }
       return countEven; 
    }
}