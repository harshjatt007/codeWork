class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length==0 || nums==null) return new int[0];
        if(k==1) return nums;
        int n=nums.length;
        ArrayDeque<Integer>dq=new ArrayDeque<>();
        int result[]=new int[n-k+1];
        for(int i=0;i<n;i++){
            if(!dq.isEmpty() && dq.peekFirst()<=i-k) dq.pollFirst(); // out of window check
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) dq.pollLast(); // ensure max element is in the front of dq
            dq.offerLast(i); // add current element index in dq
            if(i>=k-1) result[i-k+1]=nums[dq.peekFirst()]; // store max elem once onwards when we reach window size of k 
        }
        return result;
    }
}