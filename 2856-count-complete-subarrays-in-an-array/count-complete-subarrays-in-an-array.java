class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int uniqueElementsSize=set.size();
        int left=0,right=0;
        int n=nums.length;
        int completeSubArrays=0;
        HashMap<Integer,Integer>freq=new HashMap<>();
        while(left<n){
            while(right<n && freq.size()<uniqueElementsSize){
                freq.put(nums[right],freq.getOrDefault(nums[right],0)+1);
                right++;
            }
            if(freq.size()<uniqueElementsSize){
                break;
            }
            completeSubArrays+=n-right+1;
            freq.put(nums[left],freq.get(nums[left])-1);
            if(freq.get(nums[left])==0) freq.remove(nums[left]);
            left++;
        }
        return completeSubArrays;
    }
}