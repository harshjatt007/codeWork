class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>result=new ArrayList<>();
        List<Integer>arr=new ArrayList<>();
        for(int i:nums) arr.add(i);
        permutations(result,arr,0);
        return result;
    }
    public void permutations(List<List<Integer>>result,List<Integer>arr,int start){
       if(start==arr.size()){
            result.add(new ArrayList<>(arr));
            return;
       }
       for(int i=start;i<arr.size();i++){
            ArrayList<Integer>arr1=new ArrayList<>(arr);
            swap(arr1,start,i);
            permutations(result,arr1,start+1);
       }
    }
    public void swap(List<Integer>arr1,int i,int j){
        int temp=arr1.get(i);
        arr1.set(i,arr1.get(j));
        arr1.set(j,temp);
        return;
    }
}