class Solution {
    public int search(int[] nums, int target) {
        int search=Arrays.binarySearch(nums,target);
        return search<0?-1:search;
    }
}