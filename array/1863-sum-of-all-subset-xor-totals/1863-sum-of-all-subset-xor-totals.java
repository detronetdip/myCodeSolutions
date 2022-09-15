class Solution {
    private int helper(int[] nums, int index, int currentXor) {
        if (index == nums.length) return currentXor;
        int pick = helper(nums, index + 1, currentXor ^ nums[index]);
        int notpick = helper(nums, index + 1, currentXor);
        return pick + notpick;
    }
    public int subsetXORSum(int[] nums) {
        return helper(nums,0,0);
    }
}