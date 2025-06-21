import java.util.*;

class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> even = new HashMap<>();
        Map<Integer, Integer> odd = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) even.put(nums[i], even.getOrDefault(nums[i], 0) + 1);
            else odd.put(nums[i], odd.getOrDefault(nums[i], 0) + 1);
        }

        // Get the most and second-most frequent numbers for even and odd positions
        int[] even1 = {0, 0}, even2 = {0, 0};
        int[] odd1 = {0, 0}, odd2 = {0, 0};
        for (var e : even.entrySet()) {
            if (e.getValue() > even1[1]) {
                even2 = even1;
                even1 = new int[]{e.getKey(), e.getValue()};
            } else if (e.getValue() > even2[1]) {
                even2 = new int[]{e.getKey(), e.getValue()};
            }
        }
        for (var e : odd.entrySet()) {
            if (e.getValue() > odd1[1]) {
                odd2 = odd1;
                odd1 = new int[]{e.getKey(), e.getValue()};
            } else if (e.getValue() > odd2[1]) {
                odd2 = new int[]{e.getKey(), e.getValue()};
            }
        }

        int evenLen = (n + 1) / 2, oddLen = n / 2;
        if (even1[0] != odd1[0]) {
            return (evenLen - even1[1]) + (oddLen - odd1[1]);
        } else {
            int op1 = (evenLen - even1[1]) + (oddLen - odd2[1]);
            int op2 = (evenLen - even2[1]) + (oddLen - odd1[1]);
            return Math.min(op1, op2);
        }
    }
}
