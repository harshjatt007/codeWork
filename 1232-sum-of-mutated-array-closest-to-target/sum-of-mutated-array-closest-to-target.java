// class Solution {
//     public int findBestValue(int[] arr, int target) {
//         Arrays.sort(arr);
//         int n = arr.length;
//         int[] prefix = new int[n + 1];
//         for (int i = 0; i < n; ++i) {
//             prefix[i + 1] = prefix[i] + arr[i];
//         }
        
//         int left = 0;
//         int right = arr[n - 1];
//         int bestValue = 0;
//         int minDiff = Integer.MAX_VALUE;
        
//         while (left <= right) {
//             int mid = left + (right - left) / 2;
//             int index = binarySearch(arr, mid);
//             int sum = prefix[index] + (n - index) * mid;
//             int diff = Math.abs(sum - target);
            
//             if (diff < minDiff || (diff == minDiff && mid < bestValue)) {
//                 minDiff = diff;
//                 bestValue = mid;
//             }
            
//             if (sum < target) {
//                 left = mid + 1;
//             } else {
//                 right = mid - 1;
//             }
//         }
//         return bestValue;
//     }
    
//     private int binarySearch(int[] arr, int target) {
//         int left = 0;
//         int right = arr.length;
//         while (left < right) {
//             int mid = left + (right - left) / 2;
//             if (arr[mid] > target) {
//                 right = mid;
//             } else {
//                 left = mid + 1;
//             }
//         }
//         return left;
//     }
// }
class Solution {
    public int findBestValue(int[] A, int target) {
        Arrays.sort(A);
        int n = A.length, i = 0;
        while (i < n && target > A[i] * (n - i)) {
            target -= A[i++];
        }
        if (i == n) return A[n - 1];
        int res = target / (n - i);
        if (target - res * (n - i) > (res + 1) * (n - i) - target)
            res++;
        return res;
    }
}