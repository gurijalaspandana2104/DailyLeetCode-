class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List< Integer>> res=new ArrayList();
         List<Integer> cur = new ArrayList<>();
        backtrack(nums,target,cur, res,0); 
        return res;
    }
         public void backtrack(int[]nums,int target, List<Integer>cur,List<List<Integer>> res,int i )
         {
            if(target==0)
            {
              res.add(new ArrayList<>(cur));
              return;  
            }
            if(target<0||i>=nums.length)
            {
            return;
            }
          cur.add(nums[i]);
          backtrack(nums,target-nums[i],cur,res,i);
           
          cur .remove( cur .size()-1);
          backtrack(nums,target,cur ,res,i+1);
         }
      
     
}
