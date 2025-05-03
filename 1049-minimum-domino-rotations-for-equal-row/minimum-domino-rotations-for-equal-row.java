// class Solution {
//     public int minDominoRotations(int[] tops, int[] bottoms) {
//         int countSwaps=0;
//         // first Map
//         HashMap<Integer,Integer>map=new HashMap<>();
//         // Second Map
//         HashMap<Integer,Integer>map2=new HashMap<>();

//         for(int i=0;i<tops.length;i++){
//             map.put(tops[i],map.getOrDefault(tops[i],0)+1);
//             map2.put(bottoms[i],map2.getOrDefault(bottoms[i],0)+1);
//         }
//         int maxValue=0;
//         int maxElement=0;
//         for(Map.Entry<Integer,Integer>entry:map.entrySet()){
//            if(entry.getValue()>maxValue){
//                 maxValue=entry.getValue();
//                 maxElement=entry.getKey();
//            }
//         }
//         int maxValue2=0;
//         int maxElement2=0;
//         for(Map.Entry<Integer,Integer>entry:map2.entrySet()){
//            if(entry.getValue()>maxValue2){
//                 maxValue2=entry.getValue();
//                 maxElement2=entry.getKey();
//            }
//         }
//         boolean useTop=maxValue>maxValue2;
//         int maxFromBoth=useTop?maxElement:maxElement2;

//         for(int i=0;i<tops.length;i++){
//             if(useTop){
//                 if(tops[i]==maxFromBoth) continue;
//                 else if(bottoms[i]==maxFromBoth) countSwaps++;
//                 else return -1; 
//             }
//             else {
//                 if(bottoms[i]==maxFromBoth) continue;
//                 else if(tops[i]==maxFromBoth) countSwaps++;
//                 else return -1;
//             }
//         }
//         return countSwaps;
//     }
// }


class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int candidate1=check(tops[0],tops,bottoms);
        if(candidate1!=-1) return candidate1;
        int candidate2=check(bottoms[0],tops,bottoms);
        return candidate2;
    }
    public int check(int target,int []tops,int bottoms[]){
        int topSwaps=0;
        int bottomSwaps=0;
        for(int i=0;i<tops.length;i++){
            if(target!=tops[i] && target!=bottoms[i]) return -1;
            if(target!=tops[i]) topSwaps++;
            if(target!=bottoms[i]) bottomSwaps++;
        }
        return Math.min(topSwaps,bottomSwaps);
    }
}
