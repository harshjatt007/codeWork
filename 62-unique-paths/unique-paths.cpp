class Solution {
public:
    int uniquePaths(int m, int n) {
        vector<vector<int>>dp(m+1,vector<int>(n+1));
        dp[1][1]=1;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(i==1 && j==1) continue;
                dp[i][j]=dp[i-1][j]+dp[i][j-1]; // No . of ways to reach a point is equal to no. of ways to reach it from top+right
            }
        }
        return dp[m][n];
    }
};