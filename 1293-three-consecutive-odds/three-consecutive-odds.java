class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int countOdds=0;
        for(int num:arr){
            if(num %2==1){ countOdds++;
            if(countOdds==3) return true;
            }
            else countOdds=0;
        }
        return false;
    }
}