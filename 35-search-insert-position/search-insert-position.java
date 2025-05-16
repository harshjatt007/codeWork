class Solution {
    public int searchInsert(int[] nums, int target) {
        int search=Arrays.binarySearch(nums,target);
        return search<0?-search-1:search;
    }
}