class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        for (int num : nums) current.add(num);
        backtrack(0, current, result);
        return result;
    }

    private void backtrack(int start, List<Integer> arr, List<List<Integer>> result) {
        if (start == arr.size()) {
            result.add(new ArrayList<>(arr));
            return;
        }
        for (int i = start; i < arr.size(); i++) {
            Collections.swap(arr, start, i);
            backtrack(start + 1, arr, result);
            Collections.swap(arr, start, i); 
        }
    }
}