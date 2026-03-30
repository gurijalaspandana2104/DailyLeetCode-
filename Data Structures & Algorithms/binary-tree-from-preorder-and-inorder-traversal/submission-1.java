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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer>index =new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        {
            index.put( inorder[i],i);
        }
        return splittree(preorder,index,0,0,inorder.length-1 );
         
        
    }
   private TreeNode splittree(int[] preorder, Map<Integer,Integer>index,int rootindex,int left,int right)
   {
    TreeNode root=new TreeNode (preorder[rootindex]);
    int mid= index.get(preorder[rootindex]);
    if(mid>left)
    {
        root.left=splittree(preorder,index,rootindex+1,left,mid-1);
    }
    if(mid<right)
    {
        root.right=splittree(preorder,index,rootindex+mid-left+1,mid+1,right);
    }
    else
    {
        return root;
    }
  return root;
   }
}
