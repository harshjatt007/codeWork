class Solution {
public:
    vector<string> generateParenthesis(int n) {
        vector<string>arr;
        generate(arr,"",0,0,n);
        return arr;
    }
    void generate(vector<string>&arr,string s,int l,int r,int n){
        if(s.size()==2*n){
            arr.push_back(s);
            return;
        }
        if(l<n) generate(arr,s+"(",l+1,r,n);
        if(r<l) generate(arr,s+")",l,r+1,n);
    }
};