class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int start=0,pos=-1,l=nums.length;
        for(int i=0;i<l;i++){
            if(nums[i]%2==0){
                pos++;
                int t=nums[i];
                nums[i]=nums[pos];
                nums[pos]=t;
            }
        }
        return nums;
    }
}