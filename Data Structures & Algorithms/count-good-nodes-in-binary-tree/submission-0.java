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
    int count;
    
    public int dfs(TreeNode root,int maxval)
    {    count=0;
        if(root==null)
        {
            return 0;
        }
        if(root.val>=maxval)
        {
            count++;
        }
        maxval=Math.max(root.val,maxval);
        count+=dfs(root.left,maxval);
        count+=dfs(root.right ,maxval);
          return count;
    }
    public int goodNodes(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
         dfs( root,root.val);
         return count;
        
        
    }
}
