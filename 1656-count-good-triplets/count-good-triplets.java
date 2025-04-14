// class Solution {
//     public int countGoodTriplets(int[] arr, int a, int b, int c) {
//         int count=0;
//         for(int i=0;i<arr.length;i++){
//             for(int j=i+1;j<arr.length;j++){
//                 if (Math.abs(arr[i] - arr[j]) > a) continue;
//                 for(int k=j+1;k<arr.length;k++){
//                     if(Math.abs(arr[i]-arr[j])<=a && Math.abs(arr[j]-arr[k])<=b && Math.abs(arr[i]-arr[k])<=c){
//                         count++;
//                     }
//                 }
//             }
//         }
//         return count;
//     }
// }


class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int n = arr.length;
        int totalTriplets = 0;
        
        // For each 'j', we are looking for valid 'i' and 'k' values
        for (int j = 1; j < n - 1; j++) {
            List<Integer> left = new ArrayList<>();
            List<Integer> right = new ArrayList<>();
            
            // Step 1: Find valid 'i' indices such that arr[j] - arr[i] <= a
            for (int i = 0; i < j; i++) {
                if (Math.abs(arr[j] - arr[i]) <= a) {
                    left.add(arr[i]);
                }
            }
            
            // Step 2: Find valid 'k' indices such that arr[k] - arr[j] <= b and arr[k] - arr[i] <= c
            for (int k = j + 1; k < n; k++) {
                if (Math.abs(arr[k] - arr[j]) <= b) {
                    right.add(arr[k]);
                }
            }
            
            // Step 3: Count valid triplets (i, j, k)
            // You need to count combinations of 'left' and 'right' that satisfy both conditions
            for (int i : left) {
                for (int k : right) {
                    if (Math.abs(k - i) <= c) {
                        totalTriplets++;
                    }
                }
            }
        }
        
        return totalTriplets;
    }
}