class Solution {

    public int minimumOperations(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i += 3, ans++) {
            if (checkUnique(nums, i)) {
                return ans;
            }
        }
        return ans;
    }

    private boolean checkUnique(int[] nums, int start) {
        HashSet<Integer> cnt = new HashSet<>();
        for (int i = start; i < nums.length; i++) {
            if (cnt.contains(nums[i])) {
                return false;
            }
            cnt.add(nums[i]);
        }
        return true;
    }
}

// class Solution {

//     public int minimumOperations(int[] nums) {
//         boolean seen[]=new boolean[128];
//         for(int i=nums.length-1;i>=0;i--){
//             if(seen[nums[i]]){
//                 return i/3+1;
//             }
//             seen[nums[i]]=true;
//         }
//         return 0;
//     }
// }