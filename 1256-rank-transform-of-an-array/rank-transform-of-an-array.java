class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int org[]=arr.clone();
        Arrays.sort(arr);
        HashMap<Integer,Integer>map = new HashMap<>();
        int count=1;
        for(int num:arr){
            if(!map.containsKey(num))
            map.put(num,count++);
        }
        int res[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            res[i]=map.get(org[i]);
        }
        return res;
    }
}