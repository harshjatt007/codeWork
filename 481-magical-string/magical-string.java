class Solution {
    public int magicalString(int n) {
        if (n == 0) return 0;
        if (n <= 3) return 1;
        
        int[] s = new int[n + 1];
        s[0] = 1;
        s[1] = 2;
        s[2] = 2;
        
        int i = 2; // pointer for reading counts
        int j = 3; // pointer for writing
        int count = 1; // count of 1's (initial "122" has one 1)
        int num = 1; // next number to append (alternates between 1 and 2)
        
        while (j < n) {
            int size = s[i]; // how many times to append the current number
            for (int k = 0; k < size && j < n; k++) {
                s[j] = num;
                if (num == 1) count++;
                j++;
            }
            num = num == 1 ? 2 : 1; // toggle between 1 and 2
            i++;
        }
        
        return count;
    }
}