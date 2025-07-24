class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>>result=new ArrayList<>();
        List<Integer>arr=new ArrayList<>();
        for(int i:nums) arr.add(i);
        HashSet<List<Integer>> set = new HashSet<>();
        permute(set,arr,0);
        result.addAll(set);
        return result;
    }
    public void permute(HashSet<List<Integer>>set,List<Integer>arr,int start){
        if(start==arr.size()){
            set.add(new ArrayList<>(arr));
            return;
        }
        for(int i=start;i<arr.size();i++){
            Collections.swap(arr,i,start);
            permute(set,arr,start+1);
            Collections.swap(arr,i,start);
        }
        return ;
    }
}