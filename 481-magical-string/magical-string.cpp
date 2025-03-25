class Solution {
public:
    int magicalString(int n) {
        if(n==0) return 0;
        if(n<=3) return 1;
        int s[n+1];
        s[0]=1;s[1]=2;s[2]=2;
        int i=2;
        int j=3;
        int count=1;
        int num=1;
        while(j<n){
            int size=s[i];
            for(int k=0;k<size && j<n;k++){
                s[j]=num;
                if(num==1) count++;
                j++;
            }
            num=num==1?2:1;
            i++;
        }
        return count;
    }
};