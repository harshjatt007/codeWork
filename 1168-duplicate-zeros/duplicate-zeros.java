// class Solution {
//     public void duplicateZeros(int[] arr) {
//         int nums[]=new int[arr.length];
//         int i=0;
//         int index=0;
//         while(i<arr.length){
//             if(arr[index]!=0){
//                 nums[i]=arr[index];
//                 i++;
//                 index++;
//             }
//             else{
//                 nums[i]=0;
//                 index++;
//                 if(i+1<arr.length){
//                 nums[i+1]=0;
//                 i+=2;
//                 }
//                 else i++;
//             }
//         }
//         System.arraycopy(nums,0,arr,0,arr.length);
//     }
// }
class Solution {
    public void duplicateZeros(int[] arr) {
        int length = arr.length;
        int[] temp = Arrays.copyOf(arr, length);
        int i = 0;
        int j = 0;
        
        while (i < length) {
            arr[i] = temp[j];
            
            if (temp[j] == 0 && i < length - 1) {
                arr[++i] = 0;
            }
            
            i++;
            j++;
        }
    }
}