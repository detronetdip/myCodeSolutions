class Solution {
    public void moveZeroes(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                int j=i;
                while(j<nums.length && nums[j]==0 ){
                    j++;
                }
                if(j<nums.length){
                    int t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
                }
            }
        }
    }
}