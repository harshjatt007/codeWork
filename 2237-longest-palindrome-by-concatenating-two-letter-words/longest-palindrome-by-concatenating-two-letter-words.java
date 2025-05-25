class Solution {
    public int longestPalindrome(String[] words) {
        int[][] count = new int[26][26];
        int result = 0;
        boolean hasMiddle = false;

        for (String word : words) {
            int a = word.charAt(0) - 'a';
            int b = word.charAt(1) - 'a';

            if (count[b][a] > 0) {
                // Found a reverse pair
                result += 4;
                count[b][a]--;
            } else {
                count[a][b]++;
            }
        }

        // Check for possible middle word like "gg"
        for (int i = 0; i < 26; i++) {
            if (count[i][i] > 0) {
                hasMiddle = true;
                break;
            }
        }

        if (hasMiddle) result += 2;
        return result;
    }
}
