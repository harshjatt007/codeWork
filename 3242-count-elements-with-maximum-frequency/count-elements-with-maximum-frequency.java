class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums) map.put(num,map.getOrDefault(num,0)+1);
        int maxFreq=0;
        int count=0;
        for(int value:map.values()) maxFreq=Math.max(maxFreq,value);
        for(int value:map.values()) if(maxFreq==value) count+=value;
        return count;
    }
}