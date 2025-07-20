class Solution {
    public long appealSum(String s) {
        int n = s.length();
        // last position for each character (26 lowercase English)
        int[] last = new int[26];
        // Fill with -1 meaning "not seen yet"
        for (int i = 0; i < 26; ++i) last[i] = -1;
        long res = 0;
        long total = 0;
        
        for (int i = 0; i < n; ++i) {
            int c = s.charAt(i) - 'a';
            // For s[i], it helps total substrings ending here
            total += i - last[c];
            last[c] = i;
            res += total;
        }
        return res;
    }
}
