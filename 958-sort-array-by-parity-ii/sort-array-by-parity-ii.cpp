class Solution {
public:
    vector<int> sortArrayByParityII(vector<int>& nums) {
        int n=nums.size();
        int i=0;
        int j=n-1;
        while(i<n && j>=0){
            if(nums[i]%2==0) i+=2;
            else if (nums[j]%2==1) j-=2;
            else swap(nums[i],nums[j]);
        }
        return nums;
    }
};