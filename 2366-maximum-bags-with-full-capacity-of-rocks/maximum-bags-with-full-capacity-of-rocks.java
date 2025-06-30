class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int remaining[]=new int[rocks.length];
        for(int i=0;i<rocks.length;i++){
            remaining[i]=capacity[i]-rocks[i];
        }     
        Arrays.sort(remaining);
        int ans=0;
        for(int i=0;i<remaining.length;i++){
            if(remaining[i]==0) {ans++; continue;}
       
        int use=Math.min(remaining[i],additionalRocks);
        remaining[i]-=use; additionalRocks-=use;
           if(remaining[i]==0) ans++;
        }  
        return  ans;
    }
}