class Solution {
    public int longestContinuousSubstring(String s) {
        int maxLen=1;
        int len=1;
        for(int i=0;i<s.length()-1;i++){
            if((s.charAt(i)-'a')+1==s.charAt(i+1)-'a'){
                len++;
            }
            else len=1;
            maxLen=Math.max(maxLen,len);
        }
        return maxLen;
    }
}