class Solution {
    public int maximumGain(String s, int x, int y) {
        if (x < y) {
            return maximumGain(swapABBA(s), y, x);
        }

        int res = 0;
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == 'b' && sb.length() > 0 && sb.charAt(sb.length()-1) == 'a') {
                sb.deleteCharAt(sb.length()-1);
                res += x;
            } else {
                sb.append(c);
            }
        }

        StringBuilder afterFirst = sb;
        sb = new StringBuilder();
        for (int i = 0; i < afterFirst.length(); ++i) {
            char c = afterFirst.charAt(i);
            if (c == 'a' && sb.length() > 0 && sb.charAt(sb.length()-1) == 'b') {
                sb.deleteCharAt(sb.length()-1);
                res += y;
            } else {
                sb.append(c);
            }
        }
        return res;
    }

    private String swapABBA(String s) {
        StringBuilder swapped = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == 'a') swapped.append('b');
            else if (c == 'b') swapped.append('a');
            else swapped.append(c);
        }
        return swapped.toString();
    }
}
