class Solution {
    public int balancedStringSplit(String s) {
        int splitCounts=0;
        int currSum=0;
        for(char next:s.toCharArray()){
            if(next=='R') currSum++;
            else currSum--; // 'L'
            if(currSum==0) splitCounts++;
        }
        return splitCounts;
    }
}