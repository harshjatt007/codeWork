// class Solution {
//     public int countDays(int days, int[][] meetings) {
//         Arrays.sort(meetings,(a,b)->Integer.compare(a[0],b[0]));
//         HashSet<Integer>set=new HashSet<>();
//         int count=0;
//         for(int i=1;i<=days;i++){
//             set.add(i);
//         }
//         for(int i=0;i<meetings.length;i++){
//             for(int j=meetings[i][0];j<=meetings[i][1];j++){
//                     set.remove(j);
//             }
//         }
//         return set.size();
//     }
// }

// FOR TLE

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int countDays(int days, int[][] meetings) {
        if (meetings.length == 0) {
            return days;
        }

        // Sort meetings by start day
        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);

        // Merge overlapping or adjacent intervals
        List<int[]> merged = new ArrayList<>();
        int[] current = meetings[0];
        merged.add(current);

        for (int[] meeting : meetings) {
            if (meeting[0] <= current[1] + 1) {
                // Overlapping or adjacent, merge them
                current[1] = Math.max(current[1], meeting[1]);
            } else {
                // New interval
                current = meeting.clone();
                merged.add(current);
            }
        }

        // Calculate total busy days
        int busyDays = 0;
        for (int[] interval : merged) {
            busyDays += interval[1] - interval[0] + 1;
        }

        // Free days = total days - busy days
        return days - busyDays;
    }
}