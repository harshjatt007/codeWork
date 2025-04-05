// class Solution {
//     public int subsetXORSum(int[] nums) {
//         int total=0;
//         for(int num:nums){
//             total=total | num;
//         }
//         return total<<(nums.length-1);
//     }
// }

class Solution {
    public int subsetXORSum(int[] nums) {
        return XORSum(nums,0,0);
    }
    public int XORSum(int[]nums,int index,int currentXOR){
        if(index==nums.length){
            return currentXOR;
        }
        int withElementXOR=XORSum(nums,index+1,nums[index]^currentXOR);
        int withOutElementXOR=XORSum(nums,index+1,currentXOR);
        return withElementXOR+withOutElementXOR;
    }
}