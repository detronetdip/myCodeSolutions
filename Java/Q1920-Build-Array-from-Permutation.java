class Solution {
    public int[] buildArray(int[] nums) {
        if(nums.length==0){
            return nums;
        }
        int[] res=new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            res[i]=nums[nums[i]];
        }
        return res;
    }
}