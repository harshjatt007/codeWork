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
    public int countNodes(TreeNode root) {
       return traverse(root);
    }
    public int traverse(TreeNode root){
        if(root==null) return 0;
       if(root.left==null && root.right==null ) return 1;
       return  traverse(root.left)+traverse(root.right)+1;
    }
}