class Solution {
public:
    vector<int> largestDivisibleSubset(vector<int>& nums) {
        int n=nums.size();
        if(n==0) return {};
        sort(nums.begin(),nums.end());
        vector<int>dp(n,1);
        vector<int>parent(n,-1);
        int maxIndex=0;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]%nums[j]==0 && dp[i]<dp[j]+1){
                    dp[i]=dp[j]+1;
                    parent[i]=j;
                }
            }
            if(dp[maxIndex]<dp[i]){
                maxIndex=i;
            }
        }
        vector<int>result;
        while(maxIndex>=0){
            result.push_back(nums[maxIndex]);
            maxIndex=parent[maxIndex];
        }
        reverse(result.begin(),result.end());
        return result;
    }
};