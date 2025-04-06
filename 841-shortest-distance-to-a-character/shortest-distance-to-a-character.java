// class Solution {
//     public int[] shortestToChar(String s, char c) {
//         List<Integer>list = new ArrayList<>();
//         for(int i = 0; i<s.length(); i++){
//             if(s.charAt(i)==c){
//                 list.add(i);
//             }
//         }
//         int ans[] = new int[s.length()];
//         for(int i = 0; i<s.length(); i++){
//             int min = Integer.MAX_VALUE;
//             for(int j = 0; j<list.size(); j++){
//                 min = Math.min(min,Math.abs(i-list.get(j)));
//             }
//              ans[i] = min;
//         }
//         return ans;
        
//     }
// }
class Solution {
    public int[] shortestToChar(String s, char c) {
        int count = 0;
        char[] arr = s.toCharArray();
        int[] pos = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == c) {
                pos[count] = i;
                count++;
            }
        }
        int[] ans = new int[arr.length];
        for (int i = 0; i < pos[0]; i++) {
            ans[i] = pos[0] - i;
        }
        for (int i = 0; i < count - 1; i++) {
            int left = pos[i];
            int right = pos[i + 1];
            int mid = (left + right) / 2;
            for (int j = left; j <= mid; j++) {
                ans[j] = j - left;
            }
            for (int j = mid + 1; j <= right; j++) {
                ans[j] = right - j;
            }
        }
        for (int i = pos[count - 1]; i < arr.length; i++) {
            ans[i] = i - pos[count - 1];
        }
        return ans;
    }
}