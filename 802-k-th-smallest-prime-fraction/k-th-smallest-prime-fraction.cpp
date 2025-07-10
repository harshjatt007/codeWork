class Solution {
public:
    vector<int> kthSmallestPrimeFraction(vector<int>& arr, int k) {
        priority_queue<tuple<double,int,int>>pq;
        int n=arr.size();
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                double fraction=(double)arr[i]/arr[j];
                pq.emplace(fraction,arr[i],arr[j]);
                if(pq.size()>k) pq.pop();
            }
        }
        auto[fraction,num,den]=pq.top();
        return {num,den};
    }
};