class Solution {
public:
    int maximumCount(vector<int>& nums) {
        int plusCount=0;
        int minusCount=0;
        for(int i=0;i<nums.size();i++){
            if(nums[i]>0) plusCount++;
            if(nums[i]<0) minusCount++;
        }
        return max(plusCount,minusCount);
    }
};