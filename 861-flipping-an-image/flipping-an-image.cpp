class Solution {
public:
    vector<vector<int>> flipAndInvertImage(vector<vector<int>>& image) {
        vector<vector<int>> ans;
        for(int i = 0; i < image.size(); i++) {
            reverse(image[i].begin(), image[i].end());
            for(int j = 0; j < image[0].size(); j++) {
                image[i][j] = (image[i][j] & 1) == 1 ? 0 : 1;
            }
            ans.push_back(image[i]);
        }
        return ans;
    }
};