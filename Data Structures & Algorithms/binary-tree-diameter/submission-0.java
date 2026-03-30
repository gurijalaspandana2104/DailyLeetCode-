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
    int maxdia=0;
     public int calcdepth( TreeNode root)
        {
              
             int lc;
              int rc;
            if(root==null)
            {
               
            return   -1;
            }
             lc=1+calcdepth(root.left);
            rc=1+calcdepth(root.right);
            maxdia= Math.max(maxdia,lc+rc);
             return Math.max(lc, rc);

            
            

        }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)
        {
            return  0;
        }
        else
        {
            calcdepth(  root);
            
        }
       return maxdia; 
        
    }
}
