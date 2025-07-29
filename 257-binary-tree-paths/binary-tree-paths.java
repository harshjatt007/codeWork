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
        paths(root,ans,new StringBuilder());
        return ans;
    }

    public void paths(TreeNode curr,ArrayList<String>ans,StringBuilder str){
        if(curr==null) return; 
        int len=str.length();
        if(curr.left==null && curr.right==null){
            str.append(String.valueOf(curr.val));
            ans.add(str.toString());
        }
        else {
            str.append(String.valueOf(curr.val)+"->");
            paths(curr.left,ans,str);
            paths(curr.right,ans,str);
            }
        str.delete(len,str.length());
    }
}