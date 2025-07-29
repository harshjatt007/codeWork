class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int sorted[]=nums.clone();
        Arrays.sort(sorted);
        int n=nums.length;
        int start=0,end=n-1;
        while(start<n && nums[start]==sorted[start]) start++;
        while(end>start && nums[end]==sorted[end]) end--;
        return (end-start+1);
    }
}