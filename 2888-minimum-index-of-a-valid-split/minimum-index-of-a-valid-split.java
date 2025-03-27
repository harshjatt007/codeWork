class Solution {
    public int minimumIndex(List<Integer> nums) {
        HashMap<Integer,Integer>firstFreq=new HashMap<>();
        HashMap<Integer,Integer>secondFreq=new HashMap<>();
        for(int num:nums){
            secondFreq.put(num,secondFreq.getOrDefault(num,0)+1);
        }
        for(int index=0;index<nums.size();index++){
            int num=nums.get(index);
            secondFreq.put(num,secondFreq.get(num)-1);
            firstFreq.put(num,firstFreq.getOrDefault(num,0)+1);
            if(firstFreq.get(num)*2>index+1 && secondFreq.get(num)*2>nums.size()-index-1){
                return index;
            }
        }
        return -1;
    }
}