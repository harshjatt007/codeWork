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
    public boolean checkTree(TreeNode root) {
        if(root==null || (root.left==null && root.right==null)) return false;
        return checkTreeSum(root,0);
    }
    public boolean checkTreeSum(TreeNode root,int sum){
        if(root.left!=null && root.right!=null) {
            sum+=root.left.val+root.right.val;
        if(sum!=root.val) return false;
        }
        return true;
    }
}