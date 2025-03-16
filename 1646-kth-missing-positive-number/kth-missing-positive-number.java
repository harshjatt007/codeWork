class Solution {
    public int findKthPositive(int[] arr, int k) {
        int count=0;
        int index=0;
        for(int i=1;i<=arr[arr.length-1]+k;i++){
            if(i!=arr[index%arr.length])count++;
            else index++;
            if(count==k) return i;
        }
        return -1;
    }
}