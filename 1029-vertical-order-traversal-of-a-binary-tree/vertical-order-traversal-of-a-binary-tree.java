/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.*;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    private static record State(TreeNode node, int col, int row) {}

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        // grid[col][row] -> PQ of values
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> grid = new TreeMap<>();

        Queue<State> q = new ArrayDeque<>();
        q.offer(new State(root, 0, 0));

        while (!q.isEmpty()) {
            State cur = q.poll();
            TreeNode n = cur.node();
            int c = cur.col(), r = cur.row();

            grid.computeIfAbsent(c, _ -> new TreeMap<>())
                .computeIfAbsent(r, _ -> new PriorityQueue<>())
                .offer(n.val);

            if (n.left  != null) q.offer(new State(n.left,  c - 1, r + 1));
            if (n.right != null) q.offer(new State(n.right, c + 1, r + 1));
        }

        List<List<Integer>> ans = new ArrayList<>();
        for (TreeMap<Integer, PriorityQueue<Integer>> rows : grid.values()) {
            List<Integer> colList = new ArrayList<>();
            for (PriorityQueue<Integer> pq : rows.values()) {
                while (!pq.isEmpty()) colList.add(pq.poll());
            }
            ans.add(colList);
        }
        return ans;
    }
}
