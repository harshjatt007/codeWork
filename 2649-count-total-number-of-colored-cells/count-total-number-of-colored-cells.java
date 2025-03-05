class Solution {
    public long coloredCells(int n) {
        // return 1+4*((long)n*(n-1)/2);
        long count=1;
        long jumped_size=0;
        while(n>0){
            count+=jumped_size;
            jumped_size+=4;
            n--;
        }
        return count;
    }
}