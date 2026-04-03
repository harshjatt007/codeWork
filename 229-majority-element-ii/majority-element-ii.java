class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        ArrayList<Integer>ans=new ArrayList<>();
        if(nums.length<2) return new ArrayList<Integer>(Arrays.asList(nums[0]));
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
            if(!ans.contains(num)){
                if(map.containsKey(num) && map.get(num) > (int) nums.length/3){
                    ans.add(num);
                }
            }
        }
        return ans;
    }
}