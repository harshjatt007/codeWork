class Solution {
public:
    bool canPartition(vector<int>& nums) {
        int sum=0;
        for(int num:nums) {sum+=num;}
        if(sum%2==1) return false;
        int n=nums.size();
        vector<vector<bool>>dp(n+1,vector<bool>(sum/2+1));
        dp[0][0]=true;
        for(int i=1;i<=n;i++){
            for(int j=0;j<=sum/2;j++){
                if(dp[i-1][j]){
                    dp[i][j]=true;
                }
                if(j>=nums[i-1] && dp[i-1][j-nums[i-1]]){
                    dp[i][j]=true;
                }
            }
        }
        return dp[n][sum/2];
    }
};