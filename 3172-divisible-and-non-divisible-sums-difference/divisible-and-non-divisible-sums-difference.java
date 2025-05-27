class Solution {
    public int differenceOfSums(int n, int m) {
        int divisibleCount=0;
        int notDivisibleCount=0;
        for(int i=1;i<=n;i++){
            if(i%m==0) divisibleCount+=i;
            else if(i%m!=0) notDivisibleCount+=i;
        }
        return notDivisibleCount-divisibleCount;
    }
}