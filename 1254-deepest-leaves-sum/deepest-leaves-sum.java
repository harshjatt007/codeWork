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
    int sum=0;
    public int deepestLeavesSum(TreeNode root) {
        if(root==null) return 0;
       Queue<TreeNode>q=new LinkedList<>();
       q.add(root);
       int lastSum=0;
       while(!q.isEmpty()){
            int sum=0;
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode curr=q.poll();                
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
                sum+=curr.val;
            }
            lastSum=sum;
       }
       return lastSum;
    }
}