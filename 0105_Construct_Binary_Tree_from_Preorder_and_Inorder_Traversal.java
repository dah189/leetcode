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
    int[] preorder;
    int[] inorder;
    int n;
    int next = 0;
    HashMap<Integer, Integer> idx_map = new HashMap<Integer, Integer>();
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        this.inorder = inorder;
        this.n = preorder.length; 
        
        int idx = 0;
        for (Integer val : inorder){
            idx_map.put(val, idx++);  
        }
                          
        return buildLinks(0, n-1);
    }
    
    public TreeNode buildLinks(int up, int down){
        if(up > down || next > n-1 || up > n -1 || down < 0){
            return null;
        }
        
        int find = idx_map.get(preorder[next]);
        
        
        TreeNode middle = new TreeNode(preorder[next]);
        next++;
        middle.left = buildLinks(up, find-1);
        middle.right = buildLinks(find + 1, down);        
        
        return middle;
    }
}
