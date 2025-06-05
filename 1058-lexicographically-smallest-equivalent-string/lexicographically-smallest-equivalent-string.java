import java.util.*;

public class Solution {
    // Find parent with path compression
    private int find(int[] parent, int x) {
        if (parent[x] != x)
            parent[x] = find(parent, parent[x]);
        return parent[x];
    }

    // Union by lexicographical order
    private void union(int[] parent, int x, int y) {
        int px = find(parent, x);
        int py = find(parent, y);
        if (px == py) return;

        if (px < py)
            parent[py] = px;
        else
            parent[px] = py;
    }

    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        int[] parent = new int[26];
        for (int i = 0; i < 26; i++) {
            parent[i] = i;
        }

        // Union characters from s1 and s2
        for (int i = 0; i < s1.length(); i++) {
            int a = s1.charAt(i) - 'a';
            int b = s2.charAt(i) - 'a';
            union(parent, a, b);
        }

        // Convert baseStr using the smallest lex character in each group
        StringBuilder sb = new StringBuilder();
        for (char c : baseStr.toCharArray()) {
            int smallest = find(parent, c - 'a');
            sb.append((char)(smallest + 'a'));
        }

        return sb.toString();
    }
}
