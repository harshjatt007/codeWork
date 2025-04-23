/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    vector<vector<int>> zigzagLevelOrder(TreeNode* root) {
        vector<vector<int>>result;
        if(root==NULL) return result;
        queue<TreeNode*>queue;
        queue.push(root);
        bool leftToRight=true;
        while(!queue.empty()){
            int size=queue.size();
            vector<int>row(size);
            for(int i=0;i<size;i++){
                TreeNode* currNode=queue.front();
                queue.pop();
                int index=(leftToRight)?i:(size-i-1);
                row[index]=currNode->val;
                if(currNode->left){
                    queue.push(currNode->left);
                }
                if(currNode->right){
                    queue.push(currNode->right);
                }
            }
            leftToRight=!leftToRight;
            result.push_back(row);
        }
        return result;
    }
};