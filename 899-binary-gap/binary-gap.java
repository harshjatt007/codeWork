class Solution {
    public int binaryGap(int n) {
        int maxLen=0;
        String binary= Integer.toBinaryString(n);
        int count=0;
        int lastone=0;
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='1'){
                if(lastone==0) {
                    lastone = i+1;
                    count++; }
                else if(lastone!=0) {
                    maxLen=Math.max(maxLen,(i+1)-lastone);
                    lastone=i+1;
                    count++;
                }
            }
        }
        // if(count==1) return 0;
        return maxLen;
    }
}