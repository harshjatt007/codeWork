class Solution {
    public static final int MOD=1_000_000_007;
    public int lengthAfterTransformations(String s, int t) {
        int freq[]=new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        while(t-->0){
            int temp[]=new int[26];
            for(int i=0;i<26;i++){
                if(i!=25){
                    temp[i+1]=(temp[i+1]+freq[i])%MOD;
                }
                else{
                    temp[0]=(temp[0]+freq[i])%MOD;
                    temp[1]=(temp[1]+freq[i])%MOD;
                }
            }
            freq=temp;
        }
        int result=0;
        for(int count:freq){
            result=(result+count)%MOD;
        }
        return result;
    }
}