class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int count=0;
        for(int value:map.values()){
            if(value==1) return -1;
            int groupOf3=value%3;
            count+=value/3;
            if(groupOf3%3!=0){
                count++;
            }
        }
        return count;
    }
}