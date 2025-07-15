// class Solution {
//     public int minExtraChar(String s, String[] dictionary) {
//         int n = s.length();
//         var dictionarySet = new HashSet<>(Arrays.asList(dictionary));
//         var dp = new int[n + 1];

//         for (int start = n - 1; start >= 0; start--) {
//             dp[start] = dp[start + 1] + 1;
//             for (int end = start; end < n; end++) {
//                 var curr = s.substring(start, end + 1);
//                 if (dictionarySet.contains(curr)) {
//                     dp[start] = Math.min(dp[start], dp[end + 1]);
//                 }
//             }
//         }

//         return dp[0];
//     }
// }

class Solution {
    int[] mem = new int[55];

    private int minBreak(String s, int pos, Set<String> words) {
        if (pos >= s.length()) {
            return 0; // End of string
        }

        if (mem[pos] != -1) {
            return mem[pos]; // Already calculated
        }

        int minCount = Integer.MAX_VALUE;
        StringBuilder curr = new StringBuilder();

        for (int i = pos; i < s.length(); i++) {
            curr.append(s.charAt(i)); // Building substring
            int currCount = 0;

            if (!words.contains(curr.toString())) {
                currCount += i - pos + 1; // These are extra chars
            }

            currCount += minBreak(s, i + 1, words); // Recur on remaining
            minCount = Math.min(minCount, currCount);
        }

        return mem[pos] = minCount;
    }

    public int minExtraChar(String s, String[] dictionary) {
        Arrays.fill(mem, -1); // Initialize memo array
        Set<String> wordSet = new HashSet<>(Arrays.asList(dictionary));
        return minBreak(s, 0, wordSet);
    }
}
