class Solution {
    public int climbStairs(int n) {
        int dp[]=new int[n+1]; 
        Arrays.fill(dp,Integer.MIN_VALUE);
        return climb(n,dp);
    }
    public int climb(int n,int dp[]){
        if(n==1 || n==0) return 1;
        if(n<0) return 0;
        if(dp[n]!=Integer.MIN_VALUE) return dp[n];
        dp[n]=climb(n-1,dp)+climb(n-2,dp);
        return dp[n];
    }
}