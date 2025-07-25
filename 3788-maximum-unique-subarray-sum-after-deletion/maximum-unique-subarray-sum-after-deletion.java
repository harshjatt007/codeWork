class Solution {
    public int maxSum(int[] nums) {
        if(nums.length==1) return nums[0];
        int maxSum=0;
        ArrayList<Integer>arr=new ArrayList<>();
        HashSet<Integer>set=new HashSet<>();
        for(int num:nums){
            if(num<=0) arr.add(num);
            else if(set.add(num))maxSum+=num;
        }
        if(maxSum==0){
            int max=Integer.MIN_VALUE;
            for(int i:arr){
                if(i>max) max=i;
            }
            return max;
        }
        return maxSum;
    }
}