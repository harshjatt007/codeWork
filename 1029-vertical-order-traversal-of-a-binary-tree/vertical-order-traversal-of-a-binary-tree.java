import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}

public class Solution {
    static class Info {
        TreeNode node;
        int row, col;
        Info(TreeNode node, int row, int col) {
            this.node = node;
            this.row = row;
            this.col = col;
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<Info> nodes = new ArrayList<>();
        Queue<Info> queue = new LinkedList<>();
        queue.offer(new Info(root, 0, 0));

        // BFS traversal to collect all nodes with their (row, col)
        while (!queue.isEmpty()) {
            Info info = queue.poll();
            nodes.add(info);

            if (info.node.left != null)
                queue.offer(new Info(info.node.left, info.row + 1, info.col - 1));
            if (info.node.right != null)
                queue.offer(new Info(info.node.right, info.row + 1, info.col + 1));
        }

        // Sort nodes: first by col, then row, then value
        nodes.sort((a, b) -> {
            if (a.col != b.col) return a.col - b.col;
            if (a.row != b.row) return a.row - b.row;
            return a.node.val - b.node.val;
        });

        // Group sorted nodes by column
        List<List<Integer>> result = new ArrayList<>();
        int prevCol = Integer.MIN_VALUE;

        for (Info info : nodes) {
            if (info.col != prevCol) {
                result.add(new ArrayList<>());
                prevCol = info.col;
            }
            result.get(result.size() - 1).add(info.node.val);
        }

        return result;
    }
}
