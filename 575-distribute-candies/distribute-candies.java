class Solution {
    public int distributeCandies(int[] candyType) {
        /*HashSet<Integer>set=new HashSet<>(Set.of(candyType));
        return candyType.length/set.size()==candyType.length?;*/
        int count=candyType.length/2;
        int types=1;
        Arrays.sort(candyType);
        for(int i=0;i<candyType.length-1;i++){
            if(candyType[i]!=candyType[i+1]){
                types++;
            }
        }
        return count<types?count:types;
    }
}