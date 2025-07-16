class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        List<Integer>ans=new ArrayList<>();
        int len=0;
        for(int num:nums){set.add(num); len++;}
        for(int i=1;i<=len;i++){
            if(!set.contains(i)) ans.add(i);
        }
        return ans;
    }
}