class Solution {
    public int removeElement(int[] nums, int val) {
        int in=0,j=nums.length;
        if(nums.length==1 && nums[0]!=val) return 1;
        if(nums.length==1 && nums[0]==val) return 0;
         for(int i=0;i<j;i++){
            if(nums[i]!=val){
                nums[in]=nums[i];
                in++;
            }
        }
        return in;
    }
}