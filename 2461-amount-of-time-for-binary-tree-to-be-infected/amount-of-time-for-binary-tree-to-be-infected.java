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


 /*
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

 /*
class Solution {

    public int amountOfTime(TreeNode root, int start) {
        Map<Integer, Set<Integer>> map = new HashMap<>();
        convert(root, 0, map);
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        int minute = 0;
        Set<Integer> visited = new HashSet<>();
        visited.add(start);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            while (levelSize > 0) {
                int current = queue.poll();
                for (int num : map.get(current)) {
                    if (!visited.contains(num)) {
                        visited.add(num);
                        queue.add(num);
                    }
                }
                levelSize--;
            }
            minute++;
        }
        return minute - 1;
    }

    public void convert(
        TreeNode current,
        int parent,
        Map<Integer, Set<Integer>> map
    ) {
        if (current == null) {
            return;
        }
        if (!map.containsKey(current.val)) {
            map.put(current.val, new HashSet<>());
        }
        Set<Integer> adjacentList = map.get(current.val);
        if (parent != 0) {
            adjacentList.add(parent);
        }
        if (current.left != null) {
            adjacentList.add(current.left.val);
        }
        if (current.right != null) {
            adjacentList.add(current.right.val);
        }
        convert(current.left, current.val, map);
        convert(current.right, current.val, map);
    }
}
*/
class Solution {
    private int maxDistance=0;
    public int amountOfTime(TreeNode root, int start) {
        findDepth(root,start);
        return maxDistance;
    }
    public int findDepth(TreeNode root,int start){
        if(root==null) return 0;
        int leftDepth=findDepth(root.left,start);
        int rightDepth=findDepth(root.right,start);
        
        if(root.val==start){
            maxDistance=Math.max(leftDepth,rightDepth);
            return -1;
        }
        else if(leftDepth>=0 && rightDepth>=0){
            return Math.max(leftDepth,rightDepth)+1; 
        }
        else {
            int distance=Math.abs(leftDepth) + Math.abs(rightDepth);
            maxDistance=Math.max(distance,maxDistance);
            return Math.min(leftDepth,rightDepth)-1;
        }
    }
}