class Solution {
public:
    int numberOfSubstrings(string s) {
        int l=0;
        int res=0;
        unordered_map<char,int>count;
        for(int r=0;r<s.size();r++){
            count[s[r]]+=1;
            while(count.size()==3){
                res+=s.size()-r;
                count[s[l]]-=1;
                if(count[s[l]]==0){
                    count.erase(s[l]);
                }
                l++;
            }
        }
        return res;
    }
};