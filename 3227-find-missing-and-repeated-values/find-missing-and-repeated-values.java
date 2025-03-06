// class Solution {
//     public int[] findMissingAndRepeatedValues(int[][] grid) {
//         int []nums=new int[2];
//         HashMap<Integer,Integer>map=new HashMap<>();
//         int size=0;
//         for(int elem[]:grid){
//             for(int element:elem){
//                 map.put(element,map.getOrDefault(element,0)+1);
//                 size++;
//             }
//         }
//         for(int i=1;i<=size;i++){
//             if(!map.containsKey(i)){
//                 for(Map.Entry<Integer,Integer>entry:map.entrySet())
//                 if(entry.getValue()==2)
//                 nums[0]=entry.getKey();
//                 nums[1]=i;
//                 return nums;
//                 }
//             }
//         return nums;
//     }
// }

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] g) {
         long n = g.length; 
         
        long SN = ((n*n) * ((n*n) + 1)) / 2;
        long S2N = ((n*n) * ((n*n) + 1) * (2 * (n*n) + 1)) / 6;
        long S = 0, S2 = 0;
        for (int i = 0; i < n; i++) {
            for(int j=0;j<n;j++){
            S += g[i][j];
            S2 += (long)g[i][j] * (long)g[i][j];
            }
        }
        long val1 = S - SN;
        long val2 = S2 - S2N;
        val2 = val2 / val1;
        long x = (val1 + val2) / 2;
        long y = x - val1;

        int[] ans = {(int)x, (int)y};
        return ans;
    }
}