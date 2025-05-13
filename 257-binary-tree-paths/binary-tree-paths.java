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
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String>ans=new ArrayList<>();
        paths(root,ans,"");
        return ans;
    }

    public void paths(TreeNode curr,ArrayList<String>ans,String str){
        if(curr==null) return; 
        if(curr.left==null && curr.right==null){
            str+=String.valueOf(curr.val);
        }
        else str+=String.valueOf(curr.val)+"->";
        if(curr.left==null && curr.right==null) ans.add(str);
        paths(curr.left,ans,str);
        paths(curr.right,ans,str);

    }

}