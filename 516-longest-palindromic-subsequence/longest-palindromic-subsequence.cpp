class Solution {
    int dp[1000][1000];
    string str;
public:
    int solve(int l,int r){
        if(l==r+1) return 0; // ""
        if(l==r) return 1;  // "g" one character
        if(dp[l][r]>0) return dp[l][r];
        if(str[l]==str[r]){
            dp[l][r]=solve(l+1,r-1)+2;
        }
        dp[l][r]=max(dp[l][r],solve(l+1,r));
        dp[l][r]=max(dp[l][r],solve(l,r-1));
        return dp[l][r];
    }
    int longestPalindromeSubseq(string s) {
        str=s;
        return solve(0,s.size()-1);
    }
};