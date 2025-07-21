class Solution {
    public int fib(int n,int []dp) {
        /*if(n==1 || n==0) return n;
        return fib(n-1)+fib(n-2);*/
        if(n==1 || n==0) return n;
        if(dp[n]!=0) return dp[n];
        dp[n]=fib(n-1)+fib(n-2);
        return dp[n];

    }
    public int fib(int n){
        if(n==1 || n==0) return n;
        int dp[]=new int[n+1];
        dp[0]=0;dp[1]=1;
        return fib(n,dp);
    }
}