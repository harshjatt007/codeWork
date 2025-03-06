class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int []nums=new int[2];
        HashMap<Integer,Integer>map=new HashMap<>();
        int size=0;
        for(int elem[]:grid){
            for(int element:elem){
                map.put(element,map.getOrDefault(element,0)+1);
                size++;
            }
        }
        for(int i=1;i<=size;i++){
            if(!map.containsKey(i)){
                for(Map.Entry<Integer,Integer>entry:map.entrySet())
                if(entry.getValue()==2)
                nums[0]=entry.getKey();
                nums[1]=i;
                return nums;
                }
            }
        return nums;
    }
}