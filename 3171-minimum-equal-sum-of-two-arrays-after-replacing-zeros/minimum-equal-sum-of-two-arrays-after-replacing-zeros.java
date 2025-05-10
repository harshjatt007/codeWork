class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long s1 = 0, c1 = 0, s2 = 0, c2 = 0;
        for (int x : nums1) {
            if (x == 0) c1++;
            else   s1 += x;
        }
        for (int x : nums2) {
            if (x == 0) c2++;
            else  s2 += x;
        }

        // 1) No zeros anywhere but sums differ → impossible
        if (c1 == 0 && c2 == 0 && s1 != s2) return -1;

        // 2) One side cannot catch up
        long min1 = s1 + c1, min2 = s2 + c2;
        if (c1 == 0 && min1 < min2) return -1;
        if (c2 == 0 && min2 < min1) return -1;

        // 3) Feasible: raise smaller baseline to match the larger
        return Math.max(min1, min2);
    }
}
