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
    List<List<Integer>> ans = new ArrayList<List<Integer>>();
    List<Integer> path = new ArrayList<Integer>();
    int find;

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        this.find = sum;    
        sum(root, 0);
        return ans;
    }

    public void sum(TreeNode root, int sum){
        if(root == null) return;

        sum += root.val;
        path.add(root.val);
        
        if(sum == find && (root.left == null && root.right == null)){
            ans.add(new ArrayList<Integer>(path));
        }
        
        sum(root.left, sum);
        sum(root.right, sum);
        
        path.remove(path.size() - 1);
        
        return;
    } 
}
