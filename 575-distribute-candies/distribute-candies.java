class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer>set=new HashSet<>();
        for(int num:candyType){
            set.add(num);
        }
        return candyType.length/2<set.size()?candyType.length/2:set.size();
        // int count=candyType.length/2;
        // int types=1;
        // Arrays.sort(candyType);
        // for(int i=0;i<candyType.length-1;i++){
        //     if(candyType[i]!=candyType[i+1]){
        //         types++;
        //     }
        // }
        // return count<types?count:types;
    }
}