class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean>arr=new ArrayList<>();
        int maxElement=Integer.MIN_VALUE;
        for(int num:candies){
            if(num>maxElement) maxElement=num;
        }
        for(int i:candies){
            if(i+extraCandies>=maxElement){
                arr.add(true);
            }
            else arr.add(false);
        }
        return arr;
    }
}