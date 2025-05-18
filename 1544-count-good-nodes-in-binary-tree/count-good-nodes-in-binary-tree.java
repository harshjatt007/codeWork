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
    private int count=0;
    public int goodNodes(TreeNode root) {
        return helper(root,root.val);
    }
    public int helper(TreeNode root,int maxSoFar){
        if(root==null) return 0;
        if(root.val>=maxSoFar){ count++; maxSoFar=root.val;}
        helper(root.left,maxSoFar);
        helper(root.right,maxSoFar);
        return count;
    }
}