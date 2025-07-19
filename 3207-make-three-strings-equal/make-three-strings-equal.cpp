class Solution {
public:
    int findMinimumOperations(string s1, string s2, string s3) {
        int minLen = min({s1.size(), s2.size(), s3.size()});
        int commonLength = 0;

        for (int i = 0; i < minLen; ++i) {
            if (s1[i] == s2[i] && s2[i] == s3[i]) {
                ++commonLength;
            } else {
                break;
            }
        }

        if (commonLength == 0) return -1;

        return (s1.size() - commonLength) + 
               (s2.size() - commonLength) + 
               (s3.size() - commonLength);
    }
};
