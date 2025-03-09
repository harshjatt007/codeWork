class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int l=0;
        int len=colors.length;
        int res=0;
        for(int r=1;r<len+k-1;r++){
            if(colors[(r-1)%len]==colors[(r)%len]){
                l=r;
            }
            if(r-l+1>k){
                l++;
            }
            if(r-l+1==k) res++;
        }
        return res;
    }
}