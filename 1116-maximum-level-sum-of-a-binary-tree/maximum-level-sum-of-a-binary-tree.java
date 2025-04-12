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
    public int maxLevelSum(TreeNode root) {
        if(root==null) return 0;
        int max=Integer.MIN_VALUE;
        int level=0;
        int resultLevel=0;
        Queue<TreeNode>pq=new LinkedList<>();
        pq.add(root);
        while(!pq.isEmpty()){
            int levelSize=pq.size();
            int currentMax=0;
            for(int i=0;i<levelSize;i++){
                TreeNode currentNode=pq.poll();
                currentMax+=currentNode.val;
                if(currentNode.left!=null){
                    pq.add(currentNode.left);
                }
                if(currentNode.right!=null){
                    pq.add(currentNode.right);
                }
            }
            if(currentMax>max){
                max=currentMax;
                resultLevel=level+1;
            }
            level++;
        }
        return resultLevel;
    }
}