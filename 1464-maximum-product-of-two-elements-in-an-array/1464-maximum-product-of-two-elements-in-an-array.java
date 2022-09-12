class Solution {
    public int maxProduct(int[] nums) {
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int index1=0;
        int index2=0;
        int l=nums.length;
        for(int i=0;i<l;i++){
            if(nums[i]>=max1){
                max2=max1;
                max1=nums[i];
                index2=index1;
                index1=i;
            }else if(nums[i]>max2){
                max2=nums[i];
                index2=i;
            }
        }
        // System.out.println(index1+" "+index2);
        return (nums[index1]-1) * (nums[index2]-1);
    }
}