class Solution {
    public int minOperations(int[] nums) {
        int length=nums.length;
        if(length==1) return 0;
        int step=0;
        for(int i=1;i<length;i++){
            if(nums[i]<=nums[i-1]){
                step+=nums[i-1]-nums[i]+1;
                nums[i]=nums[i-1]+1;
            }
        }
        return step;
    }
}