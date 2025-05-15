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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder==null || postorder==null || inorder.length!=postorder.length) return null;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return buildTreePostIn(inorder,0,inorder.length-1,postorder,0,postorder.length-1,map);
    }
    public TreeNode buildTreePostIn(int [] inorder,int inStart,int inEnd,int [] postorder,int postStart,int postEnd,HashMap<Integer,Integer>map){
        if(inStart>inEnd || postStart>postEnd) return null;
        TreeNode node=new TreeNode(postorder[postEnd]);
        int inRoot=map.get(postorder[postEnd]);
        int leftSize=inRoot-inStart;
        node.left=buildTreePostIn(inorder,inStart,inRoot-1,postorder,postStart,postStart+leftSize-1,map);
        node.right=buildTreePostIn(inorder,inRoot+1,inEnd,postorder,postStart+leftSize,postEnd-1,map);
        return node;
    }
}