class Solution {
public:
    int findMinimumOperations(string s1, string s2, string s3) {
        int s1Len=s1.size(),s2Len=s2.size(),s3Len=s3.size();
        if(s2==s1 && s1==s3) return 0;
        if(s1Len==s2Len && s2Len==s3Len && (s2==s1 && s1==s3)) return -1;
        int minLen=min(s1Len,min(s2Len,s3Len));
        for(int i=minLen;i>=0;i--){
            if(i==0 && (s1!=s2 || s3!=s1 || s2!=s3)) return -1; 
            if((s1.substr(0,i)==s2.substr(0,i) && s3.substr(0,i)==s2.substr(0,i))){
                return s1Len-i+s2Len-i+s3Len-i;
            }
        }
        return -1;
    }
};