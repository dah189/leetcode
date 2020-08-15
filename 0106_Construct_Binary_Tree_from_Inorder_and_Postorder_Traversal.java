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
    int[] inorder;
    int[] postorder;
    int n;
    int next;
    HashMap<Integer, Integer> idx_map;
    
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.inorder = inorder;
        this.postorder = postorder;
        n = postorder.length;
        next = n - 1;
        idx_map= new HashMap<Integer, Integer>();
        
        for(int i = 0; i< n; i++){
            idx_map.put(inorder[i], i);
        }
        
        return buildLinks(0, n-1);
    }
    
    public TreeNode buildLinks(int up, int down){
        if(up > down || next < 0 || up > n -1 || down < 0){
            return null;
        }
        int value = postorder[next];
        TreeNode node = new TreeNode(value);
        
        int find = idx_map.get(value);
        next--;
        
        node.right = buildLinks(find + 1, down);
        node.left = buildLinks(up, find - 1);
        
        return node;
        
    }
}
