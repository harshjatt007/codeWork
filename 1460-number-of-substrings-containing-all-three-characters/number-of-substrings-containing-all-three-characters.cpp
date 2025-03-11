// class Solution {
// public:
//     int numberOfSubstrings(string s) {
//         int l=0;
//         int res=0;
//         unordered_map<char,int>count;
//         for(int r=0;r<s.size();r++){
//             count[s[r]]+=1;
//             while(count.size()==3){
//                 res+=s.size()-r;
//                 count[s[l]]-=1;
//                 if(count[s[l]]==0){
//                     count.erase(s[l]);
//                 }
//                 l++;
//             }
//         }
//         return res;
//     }
// };

class Solution {
public:
    int numberOfSubstrings(string s) {
        int n=s.size();
        int i=0;
        int hash[]={-1,-1,-1};
        int count=0;
        while(i<n){
            hash[s[i]-'a']=i;
            if(hash[0]!=-1 && hash[1]!=-1 && hash[2]!=-1){
                count+=1+min(hash[0],min(hash[1],hash[2]));
            }
            i++;
        }
        return count;
    }
};