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
    List<Integer> ans = new ArrayList<Integer>();

    public List<Integer> preorderTraversal(TreeNode root) {
        if( root == null){
            return ans;
        }
        preorderNode(root);
        return ans;
    }

    public void preorderNode(TreeNode node){
        ans.add(node.val);
        if(node.left != null){
            preorderNode(node.left);
        }
        if(node.right != null){
            preorderNode(node.right);
        }
        
    }
}
