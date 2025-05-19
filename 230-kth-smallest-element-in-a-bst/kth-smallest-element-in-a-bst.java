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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> sorted = new ArrayList<>();
        inorder(root, sorted);
        return sorted.get(k - 1); // k is 1-based
    }

    private void inorder(TreeNode node, List<Integer> sorted) {
        if (node == null) return;
        inorder(node.left, sorted);
        sorted.add(node.val);
        inorder(node.right, sorted);
    }
}
