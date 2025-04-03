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
    public int[] findMode(TreeNode root) {
        //if(root==null) return null;
        HashMap<Integer,Integer>counter=new HashMap<>();
        dfs(root,counter);
        int maxFreq=0;
        for(int i:counter.keySet()){
            maxFreq=Math.max(maxFreq,counter.get(i));
        }
        List<Integer>ans=new ArrayList<>();
        for(int i:counter.keySet()){
            if(maxFreq==counter.get(i)){
                ans.add(i);
            }
        }
        int result[]=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            result[i]=ans.get(i);
        }
        return result;
    }
    public void dfs(TreeNode root,HashMap<Integer,Integer>counter){
        if(root==null) return;
        counter.put(root.val,counter.getOrDefault(root.val,0)+1);
        dfs(root.left,counter);
        dfs(root.right,counter);
    }
}