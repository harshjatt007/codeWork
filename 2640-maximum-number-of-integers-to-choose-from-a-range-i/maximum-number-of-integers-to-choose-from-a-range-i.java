class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int maxCnt=0;
        HashSet<Integer>bannedHa=new HashSet<>();
        for(int ban:banned){
            bannedHa.add(ban);
        }
        int Sum=0;
        for(int i=1;i<=n;i++){
           if(bannedHa.contains(i)) continue;
            Sum+=i;
            if(Sum>maxSum) return maxCnt; 
            maxCnt++;
        }
        return maxCnt;
    }
}