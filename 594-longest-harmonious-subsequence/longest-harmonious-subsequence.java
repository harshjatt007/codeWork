class Solution {
    public int findLHS(int[] nums) {
        int maxLength=0;
        HashMap<Integer,Integer>freq=new HashMap<>();
        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        for(int i:freq.keySet()){
            if(freq.containsKey(i+1)){
                int currentLength=freq.get(i+1)+freq.get(i);
                maxLength=Math.max(currentLength,maxLength);
            }
        }
        return maxLength;
    }
}