class Solution {
    static class Pair{
        int value;
        int index;
        Pair(int v,int i){
            this.value=v;
            this.index=i;
        }
    }
    public void merge(List<Pair>v,List<Integer>count,int left,int mid,int right){
        List<Pair>temp=new ArrayList<>();
        int i=left;
        int j=mid+1;
        while(i<=mid && j<=right){
            if(v.get(i).value<=v.get(j).value){
                temp.add(v.get(j++));
            }
            else{
                count.set(v.get(i).index,count.get(v.get(i).index)+(right-j+1));
                temp.add(v.get(i++));
            }
        }
        while(i<=mid) temp.add(v.get(i++));
        while(j<=right) temp.add(v.get(j++));
        for(int k=left;k<=right;k++){
            v.set(k,temp.get(k-left));
        }
    }
    public void mergeSort(List<Pair>v,List<Integer>count,int left,int right){
        if(left<right){
            int mid=left+(right-left)/2;
            mergeSort(v,count,left,mid);
            mergeSort(v,count,mid+1,right);
            merge(v,count,left,mid,right);
        }
    }
    public List<Integer> countSmaller(int[] nums) {
        int n=nums.length;
        ArrayList<Pair>v=new ArrayList<>();
        for(int i=0;i<n;i++){
            v.add(new Pair(nums[i],i));
        }
        List<Integer>count=new ArrayList<>(Collections.nCopies(n,0));
        mergeSort(v,count,0,n-1);
        return count;
    }
}