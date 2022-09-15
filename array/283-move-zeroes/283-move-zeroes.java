class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int start=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                    int t=nums[start];
                    nums[start]=nums[i];
                    nums[i]=t;
                start++;
            }
        }
    }
}