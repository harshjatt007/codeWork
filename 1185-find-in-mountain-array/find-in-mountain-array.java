/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray A) {
        int l = 0, r = A.length() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (A.get(m) < A.get(m + 1)) l = m + 1;
            else r = m;
        }
        int peak = l;
        int res = binSearch(A, target, 0, peak, true);
        return res != -1 ? res : binSearch(A, target, peak + 1, A.length() - 1, false);
    }

    int binSearch(MountainArray A, int t, int l, int r, boolean asc) {
        while (l <= r) {
            int m = (l + r) / 2, v = A.get(m);
            if (v == t) return m;
            if ((v < t) == asc) l = m + 1;
            else r = m - 1;
        }
        return -1;
    }
}
