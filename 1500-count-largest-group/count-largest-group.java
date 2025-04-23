class Solution {
    public int digitSum(int n){
        int result=0;
        n=Math.abs(n);
        while(n!=0){
            result=result+n%10;
            n/=10;
        }
        return result;
    }
    public int countLargestGroup(int n) {
        int count=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=1;i<=n;i++){
            int sum=digitSum(i);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        int maxValue=0;
        for(int value:map.values()){
            if(value>maxValue){
                maxValue=value;
                count=1;
            }
           else if(value==maxValue) count++;
        }
        return count;
    }
}

