class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        int n = nums.length;

        // map value -> sorted indices
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.putIfAbsent(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
        }

        List<Integer> ans = new ArrayList<>();

        for (int q : queries) {
            int val = nums[q];
            ArrayList<Integer> list = map.get(val);

            if (list.size() == 1) {
                ans.add(-1);
                continue;
            }

            int pos = Collections.binarySearch(list, q);

            int m = list.size();
            int left = list.get((pos - 1 + m) % m);
            int right = list.get((pos + 1) % m);

            int dist1 = Math.abs(q - left);
            int dist2 = Math.abs(q - right);

            // circular distances
            dist1 = Math.min(dist1, n - dist1);
            dist2 = Math.min(dist2, n - dist2);

            ans.add(Math.min(dist1, dist2));
        }

        return ans;
    }
}