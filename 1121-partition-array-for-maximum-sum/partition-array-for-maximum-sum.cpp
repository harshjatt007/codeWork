class Solution {
public:
    int maxSumAfterPartitioning(vector<int>& arr, int k) {
        int n=arr.size();
        vector<int>dp(n+1);
        dp[0]=0;
        for(int i=1;i<=n;i++){
            int maxElement=0;
            for(int j=1;j<=min(i,k);j++){
                maxElement=max(maxElement,arr[i-j]);
                int option=dp[i-j]+maxElement*j;
                dp[i]=max(dp[i],option);
            }
        }
        return dp[n];
    }
};