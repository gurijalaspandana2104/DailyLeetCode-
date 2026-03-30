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
    boolean istrue=true;
    public boolean isBalanced(TreeNode root) {
        
        calheight(root);
        return  istrue;
    }
    public  int calheight(TreeNode root)
    {
        int lc,rc;
        
        if(root==null)
        {
            return -1;
        }
        lc=1+calheight(root.left);
        rc=1+calheight(root.right);
       if(Math.abs(lc-rc) >1)
       {
       istrue=false;
       }  
       return Math.max(lc,rc);

    }
}
