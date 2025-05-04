class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int count=0;
        HashMap<String,Integer>map=new HashMap<>();
        for(int i=0;i<dominoes.length;i++){
            int a=Math.min(dominoes[i][0],dominoes[i][1]);
            int b=Math.max(dominoes[i][0],dominoes[i][1]);
            String key=a+","+b;
            int exisiting=map.getOrDefault(key,0);
            count+=exisiting;
            map.put(key,exisiting+1);
        }
        return count;
    }
}