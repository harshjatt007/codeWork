class Solution {
public:
int n,m,q;
string a,b,c;
unordered_map<string ,bool>mp;
    bool kill(int i, int j ,int k){
        string ki= to_string(i) + ","+to_string(j);
        if(mp.count(ki)) return mp[ki];

        if(i>=n && j>=m && k==q) return  mp[ki]= true;
        if(k>= q) return false;
        bool ans1, ans2;
        if(a[i]==c[k] &&
             kill(i+1,j,k+1)){ return  mp[ki]=true;
        }
        if(b[j]==c[k] &&kill(i,j+1,k+1)){
            return mp[ki]= true;
        }
    return  mp[ki]=false;
    }
    bool isInterleave(string s1, string s2, string s3) {
        n=s1.size(), m =s2.size() , q=s3.size();
        if(n+m!=q) return false;
        a=s1,b=s2 , c=s3;
        return kill(0,0,0);
    }
};