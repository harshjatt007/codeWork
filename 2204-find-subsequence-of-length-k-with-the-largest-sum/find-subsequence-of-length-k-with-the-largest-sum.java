class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int ans[]=new int[k];
        PriorityQueue<Integer>pq=new PriorityQueue(Collections.reverseOrder());
        for(int num:nums) pq.add(num);
        ArrayList<Integer>arr=new ArrayList<>();
        int count=k;
        while(count-->0){
            arr.add(pq.poll());
        }
        int ind=0;
        for(int i=0;i<nums.length;i++){
            if(arr.contains(nums[i])){ 
            arr.remove(Integer.valueOf(nums[i]));
            ans[ind++]=nums[i];
            }
            if(ind==k) break;
        }
        return ans;
    }
}