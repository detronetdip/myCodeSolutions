class Solution {
    public int singleNumber(int[] nums) {
        int ans=0,l=nums.length;
        for(int i=0;i<l;i++){
            ans^=nums[i];
        }
        return ans;
    }
}