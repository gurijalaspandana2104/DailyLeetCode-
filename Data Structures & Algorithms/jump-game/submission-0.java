class Solution {
    public boolean canJump(int[] nums) {
        int reach = 0;  // track farthest index we can reach
        for (int i = 0; i < nums.length; i++) {
            if (i > reach) {
                return false;   // stuck, can't reach this index
            }
            reach = Math.max(reach, i + nums[i]);  // update reach
        }
        return true;
    }
}
