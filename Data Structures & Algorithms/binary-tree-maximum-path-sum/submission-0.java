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
    public int maxPathSum(TreeNode root) {
       
        helper(root);
        return maxSum;
    }
        int maxSum= Integer.MIN_VALUE;
        private int helper(TreeNode node)
        {
         if(node==null)
        {
            return 0;
        }
            int left=Math.max(helper(node.left),0);
            int right=Math.max(helper(node.right),0);
             int currentPath = node.val + left + right;
               maxSum = Math.max(maxSum, currentPath);
            return node.val+Math.max(left,right);
        }
    }

