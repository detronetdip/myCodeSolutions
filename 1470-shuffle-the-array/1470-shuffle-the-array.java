class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans=new int[nums.length];
        int i=0,j=n,k=0;
        while(i<n){
            ans[k]=nums[i];
            k++;
            ans[k]=nums[j];
            k++;
            i++;
            j++;
        }
        return ans;
    }
}