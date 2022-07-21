class Solution {
    public static void swap(int[] nums,int i,int j){
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
    public void sortColors(int[] nums) {
        int i=0;
        int j=0;
        int k=nums.length-1;
        while(j<=k){
            if(nums[j]==2){
                swap(nums,j,k);
                k--;
            }
            if(nums[j]==0){
                swap(nums,j,i);
                i++;
            }
            if(nums[j]!=2){
                j++;
            }
        }
    }
}