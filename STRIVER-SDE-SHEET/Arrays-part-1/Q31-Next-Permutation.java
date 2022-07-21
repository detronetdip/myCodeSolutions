class Solution {
    public void nextPermutation(int[] nums) {
        int flag=0;
        int b=0;
        int s=0;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                b=i-1;
                break;
            }
        }
        for(int i=nums.length-1;i>b;i--){
            if(nums[i]>nums[b]){
                s=i;
                break;
            }
        }
        if(s!=0 || b!=0){
            int tmp=nums[s];
            nums[s]=nums[b];
            nums[b]=tmp;
            int i=b+1;
            int j=nums.length-1;
            while(i<j){
                int t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
                i++;
                j--;
            }
            return;
        }
        
        if(flag==0){
            int i=0;
            int j=nums.length-1;
            while(i<j){
                int t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
                i++;
                j--;
            }
        }
    }
}