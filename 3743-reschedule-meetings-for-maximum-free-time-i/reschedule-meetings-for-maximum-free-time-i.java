class Solution {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        int n=startTime.length;
        int gaps[]=new int[n+1];
        gaps[0]=startTime[0]-0;
        for(int i=1;i<n;i++){
            gaps[i]=startTime[i]-endTime[i-1];
        }
        gaps[n]=eventTime-endTime[n-1];
        int ans=0,sum=0,left=0;
        for(int right=0;right<=n;right++){
            sum+=gaps[right];
            while(right-left>k){
                sum-=gaps[left];
                left++;
            }
            ans=Math.max(ans,sum);
        }
        return ans;
    }
}