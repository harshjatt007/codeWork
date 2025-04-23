// class Solution {
//     public int digitSum(int n){
//         int result=0;
//         n=Math.abs(n);
//         while(n!=0){
//             result=result+n%10;
//             n/=10;
//         }
//         return result;
//     }
//     public int countLargestGroup(int n) {
//         int count=0;
//         HashMap<Integer,Integer>map=new HashMap<>();
//         for(int i=1;i<=n;i++){
//             int sum=digitSum(i);
//             map.put(sum,map.getOrDefault(sum,0)+1);
//         }
//         int maxValue=0;
//         for(int value:map.values()){
//             if(value>maxValue){
//                 maxValue=value;
//                 count=1;
//             }
//            else if(value==maxValue) count++;
//         }
//         return count;
//     }
// }

class Solution {
    public int digitSum(int n){
        int sum=0;
        while(n!=0){
            sum=sum+n%10;
            n/=10;
        }
        return sum;
    }
    public int countLargestGroup(int n) {
        int freq[]=new int[37];
        int maxGroupSize=0;
        for(int i=1;i<=n;i++){
            int sum=digitSum(i);
            freq[sum]++;
            maxGroupSize=Math.max(maxGroupSize,freq[sum]);
        }
        int count=0;
        for(int value:freq){
            if(value==maxGroupSize) count++;
        }
        return count;
    }
}
