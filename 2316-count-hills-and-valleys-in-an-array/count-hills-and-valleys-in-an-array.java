class Solution {
    public int countHillValley(int[] nums) {
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i!=0 && arr.get(arr.size()-1)==nums[i]) continue;
            arr.add(nums[i]);
        }
        int count=0;
        for(int i=1;i<arr.size()-1;i++){
            if(arr.get(i)>arr.get(i-1) && arr.get(i)>arr.get(i+1)) count++;
            else if(arr.get(i)<arr.get(i-1) && arr.get(i)<arr.get(i+1)) count++;
        }
        return count;
    }
}