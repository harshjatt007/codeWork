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
    public TreeNode bstFromPreorder(int[] preorder) {
        return bstFromPreorder(preorder,Integer.MAX_VALUE,new int []{0});
    }
    public TreeNode bstFromPreorder(int []preorder,int upperBound,int i[]){
        if(i[0]==preorder.length ||preorder[i[0]]>upperBound) return null;
        TreeNode root = new TreeNode(preorder[i[0]++]);
        root.left=bstFromPreorder(preorder,root.val,i);
        root.right=bstFromPreorder(preorder,upperBound,i);
        return root;
    }
}
/*
class Solution {
    int i; // Class-level index to keep track of the current element
    public TreeNode bstFromPreorder(int[] preorder) {
        i=0; // Initialize index
        return bstFromPreorder(preorder,Integer.MAX_VALUE);
    }
    public TreeNode bstFromPreorder(int []preorder,int bound){
        if(i==preorder.length || preorder[i]>bound) return null;
        TreeNode root=new TreeNode(preorder[i++]);
        root.left=bstFromPreorder(preorder,root.val);
        root.right=bstFromPreorder(preorder,bound);
        return root;
    }
}
*/