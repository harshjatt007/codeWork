class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n=spells.length,m=potions.length;
        int result[]=new int[spells.length];
        Arrays.sort(potions);
        for(int i=0;i<n;i++){
            int start=0;
            int end=m-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                long num=(long)spells[i]*potions[mid];
                if(num>=success) end=mid-1;
                else start=mid+1;
            }
            result[i]=m-(end+1);
        }
        return result;
    }
}