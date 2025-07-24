class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>>result=new ArrayList<>();
        List<Integer>arr=new ArrayList<>();
        for(int i:nums) arr.add(i);
         TreeSet<List<Integer>> set = new TreeSet<>((a, b) -> {
            for (int i = 0; i < a.size(); i++) {
                if (!a.get(i).equals(b.get(i))) {
                    return a.get(i) - b.get(i);
                }
            }
            return 0;
        });
        permute(set,arr,0);
        // for(List<Integer>s:set){
        //     result.add(s);
        // }
        result.addAll(set);
        return result;
    }
    public void permute(TreeSet<List<Integer>>set,List<Integer>arr,int start){
        if(start==arr.size()){
            set.add(new ArrayList<>(arr));
            return;
        }
        for(int i=start;i<arr.size();i++){
            // List<Integer>sub=new ArrayList<>(arr);
            Collections.swap(arr,i,start);
            permute(set,arr,start+1);
            Collections.swap(arr,i,start);
        }
        return ;
    }
}