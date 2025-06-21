class Solution {
public:
    int minimumOperations(vector<int>& nums) {
        int freq[100005][2] = {0};
        int n = nums.size();
        for (int i = 0; i < n; i++) {
            freq[nums[i]][i & 1]++;
        }
        int j = 0, k = 0, ans = 0;
        for (int i = 1; i <= 100000; i++) {
            ans = max(ans, max(freq[i][0] + k, freq[i][1] + j));
            j = max(j, freq[i][0]);
            k = max(k, freq[i][1]);
        }
        return n - ans;
    }
};
