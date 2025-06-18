class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int [][] result=new int[nums.length/3][3]; 
        Arrays.sort(nums);
        int idx=0;
        int j=0;
        for(int i=0;i<nums.length;i+=3){
                if(nums[i+2]-nums[i]>k){
                    return new int[][]{};
                }
                else {
                    result[j][0]=nums[i];
                    result[j][1]=nums[i+1];
                    result[j][2]=nums[i+2];
            }
            j++;
        }
        return result;
    }
}